package com.example.departmentservice.controller;


import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class DepartmentController {


    @Autowired
    private DepartmentService service;


    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside save department method of departmentController");
        return service.saveDepartment(department);
    }


    @GetMapping("/departments/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside find department method of departmentController");

        return service.findDepartmentById(departmentId);

    }
}
