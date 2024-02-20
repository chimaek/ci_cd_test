package com.example.ci_cd_test;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Override
    public String getTestString() {
        return "okay";
    }
}