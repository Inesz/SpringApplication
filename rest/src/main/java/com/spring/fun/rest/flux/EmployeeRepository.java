package com.spring.fun.rest.flux;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class EmployeeRepository {

    public Mono<Employee> findEmployeeById(String id) {
        return Mono.create(sink -> sink.success(new Employee(3L, "Alicja")));
    }

    public Flux<Employee> findAllEmployees() {
        return Flux.create(sink -> {
            sink.next(new Employee(1L, "Jan"));
            sink.next(new Employee(2L, "Kaziu"));
            sink.complete();
        });
    }
}