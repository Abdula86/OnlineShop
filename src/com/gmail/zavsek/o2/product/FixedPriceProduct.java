package com.gmail.zavsek.o2.product;

public class FixedPriceProduct implements Product {
    private static final double FIXED_PRICE = 50.0;

    @Override
    public double getPrice() {
        return FIXED_PRICE;
    }
}

