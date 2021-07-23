package org.klukasz.controller;

import org.klukasz.dto.CustomerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final RestTemplate customerService;

    public CustomerController(RestTemplate customerService) {
        this.customerService = customerService;

    }

    @GetMapping
    public CustomerDTO[] getCustomers() {
        return customerService.getForEntity("/", CustomerDTO[].class).getBody();
    }
}
