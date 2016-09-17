package com.simple.services.service;

import com.simple.interfaces.test.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by JIANYJ on 16/9/18.
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("aaaa");
    }
}
