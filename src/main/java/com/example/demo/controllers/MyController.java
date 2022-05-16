package com.example.demo.controllers;

import com.example.demo.dao.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodType;
import java.lang.management.MemoryType;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    //@RequestMapping(method= RequestMethod.GET, value="/home")
    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1,"maths"));
        courseList.add(new Course(2,"english"));

        return courseList;
    }
}
