package com.services;

import com.entities.AuthRequest;
import com.entities.AuthResponse;
import com.entities.value_objects.UserVO;
import com.fasterxml.jackson.databind.JsonNode;
import com.utills.Json;
import com.utills.Response;
import com.utills.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class AuthService {

    private final RestTemplate restTemplate;
    private final JwtUtil jwt;

    @Autowired
    public AuthService(RestTemplate restTemplate,
                       final JwtUtil jwt) {
        this.restTemplate = restTemplate;
        this.jwt = jwt;
    }

    public  Response register(AuthRequest authRequest) {
        //do validation if user already exists
        authRequest.setPassword(BCrypt.hashpw(authRequest.getPassword(), BCrypt.gensalt()));
        UserVO userAlreadyExist = restTemplate.getForObject("http://user-service/users/signin?email="+authRequest.getEmail(),  UserVO.class,authRequest);
         if(userAlreadyExist!=null){
             return new Response(Status.DUPLICATE_USER.getStatusCode(),Status.DUPLICATE_USER.getMessage(),null);
         }
        UserVO userVO = restTemplate.postForObject("http://user-service/users", authRequest, UserVO.class);
        Assert.notNull(userVO, "Failed to register user. Please try again later");



            return new Response(Status.USER_CREATED.getStatusCode(),Status.USER_CREATED.getMessage(),null);


    }
    public Response login(AuthRequest authRequest) {
        //do validation if user already exists
        //authRequest.setPassword(BCrypt.hashpw(authRequest.getPassword(), BCrypt.gensalt()));

        UserVO userVO = restTemplate.getForObject("http://user-service/users/signin?email="+authRequest.getEmail(),  UserVO.class,authRequest);
        Assert.notNull(userVO, "Failed to register user. Please try again later");

        if(!BCrypt.checkpw(authRequest.getPassword(),userVO.getPassword()))
        {
            throw  new ResponseStatusException(HttpStatus.UNAUTHORIZED,HttpStatus.UNAUTHORIZED.getReasonPhrase());
        }
        String accessToken = jwt.generate(userVO, "ACCESS");
        String refreshToken = jwt.generate(userVO, "REFRESH");
        return new Response(Status.SUCCESSFULLY_SIGNED_IN.getStatusCode(),Status.USER_CREATED.getMessage(), Json.convert(new AuthResponse(accessToken, refreshToken), JsonNode.class));


    }
}
