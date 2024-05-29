package com.example.spring_boot_rule_engine_demo.controller;

import com.example.spring_boot_rule_engine_demo.engine.RuleEngine;
import com.example.spring_boot_rule_engine_demo.model.User;
import com.example.spring_boot_rule_engine_demo.rule.Rule;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping
    public List<User> getAllUser(){
        RuleEngine<User> ruleEngine = new RuleEngine<>();
        ruleEngine.addRule(Rule.AGE_GREATER_THAN_30);
        ruleEngine.addRule(Rule.NAME_STARTS_WITH_SUM);
        List<User> filteredUser = ruleEngine.filter(userData());
        return filteredUser;
    }

    private List<User> userData() {
        List<User> users = new ArrayList<>();
        User user1 = new User("sumit", 33);
        User user2 = new User("agam", 13);
        User user3 = new User("mohit", 23);
        User user4 = new User("kailash", 43);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }

}
