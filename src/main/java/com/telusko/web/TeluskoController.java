package com.telusko.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class TeluskoController 
{
	@GetMapping("/")
    public Map<String, Object> getInfo() {

        return Map.of(
                "platform", "Telusko Learning",
                "description", "Learn Java, Spring Boot, DevOps, AI Engineering with Live + Recorded sessions",
                "website", "https://telusko.com",
                "courses", new String[]{
                        "Java Full Stack",
                        "Spring Boot",
                        "DevOps with AWS",
                        "Docker & Kubernetes",
                        "AI Engineering"
                }
        );
    }

}
