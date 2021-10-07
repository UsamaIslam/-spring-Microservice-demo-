package com.controllers;

import com.entities.Department;
import com.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public Department save(@RequestBody Department department) {
        log.info("in save Department by id endpoint");
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable long id) {

        log.info("in get Department by id endpoint");
        return departmentService.getById(id);
    }

}
