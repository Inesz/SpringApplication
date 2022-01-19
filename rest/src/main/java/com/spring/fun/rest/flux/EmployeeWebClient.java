package com.spring.fun.rest.flux;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class EmployeeWebClient {
    static final WebClient client = WebClient.create("http://localhost:8080");

    private EmployeeWebClient() {}

    static void getOneEmployee(){
        Mono<Employee> employeeMono = client.get()
                .uri("/employees/{id}", "1")
                .retrieve()
                .bodyToMono(Employee.class);

        employeeMono.subscribe(System.out::println);
    }

    static void getAllEmployees(){
        Flux<Employee> employeeFlux = client.get()
                .uri("/employees")
                .retrieve()
                .bodyToFlux(Employee.class);

        employeeFlux.subscribe(System.out::println);
    }
}
