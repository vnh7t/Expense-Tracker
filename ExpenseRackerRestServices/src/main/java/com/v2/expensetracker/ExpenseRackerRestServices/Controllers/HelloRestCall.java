package com.v2.expensetracker.ExpenseRackerRestServices.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestCall {
    @RequestMapping("/hello")
    public String greetingMessage(){
        return "Good Morning";
    }
}
