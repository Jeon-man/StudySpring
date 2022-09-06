package com.example.original.service;

import com.example.original.DTO.TestDTO;
import com.example.original.domain.Test;
import com.example.original.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public String send(TestDTO testDTO) {
        testRepository.save(Test.builder()
                .name(testDTO.getName())
                .number(testDTO.getNumber())
                .build());
        return "Success";
    }


}
