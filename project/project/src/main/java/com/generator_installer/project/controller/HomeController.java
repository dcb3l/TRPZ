package com.generator_installer.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Installer Generator Application!";
    }

    @GetMapping("/api/status")
    public String status() {
        return "Application is running successfully!";
    }
}