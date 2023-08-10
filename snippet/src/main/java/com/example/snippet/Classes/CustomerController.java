package com.example.snippet.Classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    List<Customer> customer = new ArrayList<>();    
}
