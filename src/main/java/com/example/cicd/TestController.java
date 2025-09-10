package com.example.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.status(200).body("test 성공 완료 37");
    }

    @GetMapping("/health")
    public ResponseEntity health() {
        return ResponseEntity.status(200).body("ok");
    }
}
