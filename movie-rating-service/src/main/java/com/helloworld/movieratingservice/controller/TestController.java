package com.helloworld.movieratingservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("hello")
    public ResponseEntity<String> getHelloMessage() {
        return ResponseEntity.ok("Hello, World!");
    }

    @GetMapping("admin")
    public ResponseEntity<String> getAdminMessage(JwtAuthenticationToken authenticationToken) {
        return ResponseEntity.ok("Admin Message: " + authenticationToken.getTokenAttributes().get("name"));
    }

    @GetMapping("user")
    public ResponseEntity<String> getUserMessage(JwtAuthenticationToken authenticationToken) {
        return ResponseEntity.ok("User Message: " + authenticationToken.getTokenAttributes().get("name"));
    }

    @GetMapping("admin-and-user")
    public ResponseEntity<String> getAdminAndUserMessage() {
        return ResponseEntity.ok("Admin & User Message");
    }

}
