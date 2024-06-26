package com.gm.practicasya.controllers;

import com.gm.practicasya.payloads.TestMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public ResponseEntity<TestMessage> hello(){
        return ResponseEntity.ok(new TestMessage("Hello world!"));
    }
}
