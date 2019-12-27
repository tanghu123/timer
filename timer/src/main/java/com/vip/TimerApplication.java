package com.vip;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TimerApplication {
	
	@RequestMapping("/")
    String home() {
        return "Hello K8S! The Container time is " + LocalDateTime.now();
    }

	public static void main(String[] args) {
		SpringApplication.run(TimerApplication.class, args);
	}

}
