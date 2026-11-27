
package com.sandeep.java_3tier_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Sandeep's AWS 3-Tier DevOps Project!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is UP and Running!";
    }
}
