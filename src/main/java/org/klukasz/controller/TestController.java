package org.klukasz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {

    private final RestTemplate orderService;

    public TestController(RestTemplate orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public String test() {
        return orderService.getForEntity("/test", String.class).getBody();
    }
}
