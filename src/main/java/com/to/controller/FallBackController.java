package com.to.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {
    @GetMapping("/userFallback")
    public ResponseEntity<String> userFallBack(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("User service is down. Please contact helpdesk");
    }
    
    @GetMapping("/departmentFallback")
    public ResponseEntity<String> departmentFallBack(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Department service is down. Please contact helpdesk");
    }
    
}