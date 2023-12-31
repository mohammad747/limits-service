package com.hashemi.microservices.limitsservice.controller;

import com.hashemi.microservices.limitsservice.bean.Limits;
import com.hashemi.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retirieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return new Limits(1, 1000);
    }
}
