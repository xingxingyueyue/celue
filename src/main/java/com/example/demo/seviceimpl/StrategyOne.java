package com.example.demo.seviceimpl;

import com.example.demo.sevice.PromotionStrategy;

import java.math.BigDecimal;

import static com.example.demo.constant.FruitCostOne.applePrice;
import static com.example.demo.constant.FruitCostOne.strawberryPrice;

/**
 * 苹果草莓
 */
public class StrategyOne implements PromotionStrategy {
    /**
     * 苹果和草莓
     * @param appleWeight
     * @param strawberryWeight
     * @param mangoWeight
     * @return
     */
    @Override
    public BigDecimal calculateDiscount(BigDecimal appleWeight, BigDecimal strawberryWeight,BigDecimal mangoWeight) {
        BigDecimal totalCost = (appleWeight.multiply(applePrice)).add(strawberryWeight.multiply(strawberryPrice));
        return totalCost;
    }
}

