package com.controllers;

import com.entities.User;
import com.entities.UserDto;
import com.entities.value_objects.ResponseTemplateVO;
import com.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.util.io.Streams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private KafkaTemplate<String, Object> template;

    private String topic = "practice2";

    @PostMapping
    public User save(@RequestBody User user) {
        Optional<UserDto> optional= Stream.of(user).map(u->{return new
                UserDto(0,u.getFirstName()+u.getLastName(),u.getEmail(), new String[]{"xys"});}).findFirst();
        template.send(topic, optional.get());
        return userService.save(user);
    }

    @GetMapping
    public ResponseTemplateVO getUser(
            @RequestHeader(value = "id") String userId,
            @RequestHeader(value = "role") String role) {
        log.info("get User endpoint  is called");
        return userService.getUserWithDepartment(userId);
    }
    @PutMapping(value = "/updateuser")
    public User updateUser(
            @RequestHeader(value = "id") String userId,
            @RequestHeader(value = "role") String role,@RequestBody User user) {
        log.info("update User endpoint  is called");
        return userService.updateUser(user,userId);
    }
    @GetMapping(value = "/signin")
    public User SignIn(
           @RequestParam String email) {
        log.info("Sigin User endpoint  is called");
        return userService.getUserByEmailAndPassword(email);
    }

    @GetMapping(value = "/secure")
    public String getSecure() {
        return "Secure endpoint available";
    }
}
