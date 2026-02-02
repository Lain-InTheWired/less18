package com.Impact.services;

import com.Impact.constants.AppConstants;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello() {
        return AppConstants.HELLO_WORLD;
    }
}
