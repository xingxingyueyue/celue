package com.example.demo.sevice;

import java.math.BigDecimal;

public interface PromotionStrategy {
    BigDecimal calculateDiscount(BigDecimal appleWeight, BigDecimal strawberryWeight, BigDecimal mangoWeight);
}
