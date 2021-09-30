package com.spring.fun.aspect;

import com.spring.fun.Starter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Starter.class})
class AspectTest {

    @Autowired
    EmployeeComponent employeeComponent;

    /**
     * Test output:
     * =========test 1 - aspects on Spring component==========
     * before Employee
     * Employee found
     * before Person
     * Jan is the name of the person.
     * after annotation
     * =========test 2 - aspects on Out of Spring IoC==========
     * before Employee
     * Employee found
     * before Person
     * Jan is the name of the person.
     * after annotation
     * =========test 3 - aspects as Spring bean and run on plain Java==========
     * before Person
     * =========test 4 - plain Java==========
     * Computation begin
     * Execution of compute took 1 ms and 22 tries.
     */
    @Test
    void shouldWorkSpringAndPlainAspect() {
        System.out.println("=========test 1 - aspects on Spring component==========");
        employeeComponent.printName();
        System.out.println("=========test 2 - aspects on Out of Spring IoC==========");
        new EmployeeComponent().printName();
        System.out.println("=========test 3 - aspects as Spring bean and run on plain Java==========");
        new Person().setName("Olaf");
        System.out.println("=========test 4 - plain Java==========");
        new Computation().compute();

        Assertions.assertTrue(true);
    }

}