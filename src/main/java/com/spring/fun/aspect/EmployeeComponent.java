package com.spring.fun.aspect;

import org.springframework.stereotype.Component;

@Component
public class EmployeeComponent {
    Person person = new Person();

    @SomeAnnotation
    public void printName() {
        System.out.println(person.getName());
    }
}
