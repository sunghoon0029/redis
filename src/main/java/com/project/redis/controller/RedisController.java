package com.project.redis.controller;

import com.project.redis.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {

    private final RedisService redisService;

    @GetMapping("/redis")
    public ResponseEntity<String> redisConnectionTest() throws Exception {
        return new ResponseEntity<>(redisService.redisConnectionTest(), HttpStatus.OK);
    }
}
