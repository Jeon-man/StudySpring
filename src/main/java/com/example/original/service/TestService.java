package com.example.original.service;

import com.example.original.DTO.TestDTO;
import com.example.original.domain.Test;
import com.example.original.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public String send(TestDTO testDTO) {
        testRepository.save(Test
                .builder()
                .name(testDTO.getName())
                .number(testDTO.getNumber())
                .build());
        return "Success";
    }

    public Test findTest(Long id) {
        return testRepository.findTestById(id);
    }



}
