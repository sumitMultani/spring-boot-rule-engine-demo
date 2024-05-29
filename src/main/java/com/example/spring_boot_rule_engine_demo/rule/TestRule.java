package com.example.spring_boot_rule_engine_demo.rule;

import java.util.function.Predicate;

public interface TestRule {
    <T> Predicate<T> getPredicate();
}
