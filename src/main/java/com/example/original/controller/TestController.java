package com.example.original.controller;

import com.example.original.DTO.TestDTO;
import com.example.original.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String Test() {
        return "abcdeftg";
    }

    @PostMapping("/post")
    public Boolean post(@RequestBody TestDTO testDTO) {
        testService.send(testDTO);
        return true;
    }
}
