package com.spring.fun.aspect;

public class Computation {

    public int compute() {
        int i = 0;
        do {
            i = i + 1;
        } while (Math.floor(Math.random() * 100) % 15 != 0.0);
        return i;
    }
}
