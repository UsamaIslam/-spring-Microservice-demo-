package com.services;

import com.entities.User;
import com.entities.value_objects.Department;
import com.entities.value_objects.ResponseTemplateVO;
import com.repos.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.validation.ConstraintViolationException;

@Service
@Slf4j
public class UserService {

    private final UserRepository repository;
    private final RestTemplate restTemplate;
    @Autowired
    public UserService(UserRepository repository,
                       RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }


    public User save(User user) {
        return this.repository.save(user);
    }

    public User getById(ObjectId id) {
        return this.repository.findById(id).orElse(null);
    }

    public ResponseTemplateVO getUserWithDepartment(String id) {
        User user = this.getById(new ObjectId(id));

        Department department = restTemplate.getForObject("http://department-service/departments/" + user.getDepartmentId(), Department.class);

        return new ResponseTemplateVO(user, department);
    }
    public User updateUser(User user,String id){
        User userToUpdate = this.getById(new ObjectId(id));
          userToUpdate.setDepartmentId(user.getDepartmentId());
          userToUpdate.setRole(user.getRole());
          userToUpdate.setFirstName(user.getFirstName());
          userToUpdate.setLastName(user.getLastName());
          this.repository.save(userToUpdate);
          return userToUpdate;
    }
    public User getUserByEmailAndPassword(String email){
        User userFromDb = this.repository.findUserByEmail(email);


        return userFromDb;
    }
}
