package com.example.spring_boot_rule_engine_demo.rule;

import com.example.spring_boot_rule_engine_demo.model.User;

import java.util.function.Predicate;

public enum Rule implements TestRule {

    AGE_GREATER_THAN_30(user -> user.getAge() > 30),
    NAME_STARTS_WITH_SUM(user -> user.getName().startsWith("sum"));

    private final Predicate<User> predicate;

    Rule(Predicate<User> predicate) {
        this.predicate = predicate;
    }

    public Predicate<User> getPredicate() {
        return predicate;
    }
}
