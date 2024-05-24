package com.example.demo.controller;

import com.example.demo.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class S3Controller {

    @Autowired
    private S3Service service;

    @PostMapping(value = "create")
    public String createBucket(@RequestParam(name="bucketName") String bucketName){
        service.createBucket(bucketName);

        return "create";
    }

    @DeleteMapping(value = "delete")
    public String deleteBucket(@RequestParam(name="bucketName") String bucketName){
        service.deleteBucket(bucketName);

        return "delete";
    }

    @GetMapping(value="test")
    public String get(){
        return "EVAN";
    }
}
