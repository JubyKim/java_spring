package com.example.springcalculator.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
// @RequiredArgsConstructor generates a constructor
// with 1 parameter for each field that requires special handling.
public class Calculator {

    private final ICalculator iCalculator;

    public int sum(int x , int y) {
        this.iCalculator.init();
        return this.iCalculator.sum(x,y);
    }

    public int minus(int x , int y) {
        this.iCalculator.init();
        return this.iCalculator.minus(x,y);
    }

}
