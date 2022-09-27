package com.example.original.controller;

import com.example.original.DTO.FindDTO;
import com.example.original.DTO.TestDTO;
import com.example.original.domain.Test;
import com.example.original.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
//============================
    @PostMapping("/find")
    public ResponseEntity<Test> findOne(@RequestBody FindDTO findDTO) {
        HttpHeaders resHeaders = new HttpHeaders();
        resHeaders.add("Content-Type", "application/json;charset=UTF-8");
        Test testFind = testService.findTest(findDTO.getId());
        return new ResponseEntity<>(testFind, resHeaders, HttpStatus.OK);
    }

}