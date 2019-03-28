package com.xujh.teamcity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeamcityDemoApplication {

    @GetMapping("test")
    public ResponseEntity test() {
        return ResponseEntity.ok("hello teamcity");
    }

    public static void main(String[] args) {
        SpringApplication.run(TeamcityDemoApplication.class, args);
        System.out.println("1111");
    }


}
