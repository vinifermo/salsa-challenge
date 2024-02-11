package com.salsatechnology.factory;

import java.math.BigDecimal;

public class BeachTableStrategy implements ProductStrategy {
    private static final long PRODUCT_VALUE = 25L;
    private static final BigDecimal USER_VALUE = BigDecimal.valueOf(8.1);

    @Override
    public Long getProductValue() {
        return PRODUCT_VALUE;
    }

    @Override
    public BigDecimal getUserValue() {
        return USER_VALUE;
    }
}
