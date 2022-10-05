package com.example.springcalculator.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DollarCalculator implements ICalculator {
    private int price = 1;

    private final MarketAPI marketApi;

//    publmarketAPI

    public void init() {
        System.out.println("I am called");
        this.price = marketApi.connnect();
        System.out.println("this is marketAPI : " + marketApi);
        System.out.println("this.price : " + this.price );
    }

    @Override
    public int sum(int x, int y) {
        y *= price;
        x *= price;
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        y *= price;
        x *= price;
        return x-y;
    }
}
