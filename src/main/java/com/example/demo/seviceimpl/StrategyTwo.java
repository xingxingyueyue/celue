package com.example.demo.seviceimpl;

import com.example.demo.sevice.PromotionStrategy;

import java.math.BigDecimal;

import static com.example.demo.constant.FruitCostOne.applePrice;
import static com.example.demo.constant.FruitCostOne.strawberryPrice;
import static com.example.demo.constant.FruitCostTwo.mangoPrice;

/**
 * 增加了一种水果芒果
 */
public class StrategyTwo implements PromotionStrategy {
    /**
     * 增加了一种水果芒果
     * @param appleWeight
     * @param strawberryWeight
     * @param mangoWeight
     * @return
     */
    @Override
    public BigDecimal calculateDiscount(BigDecimal appleWeight, BigDecimal strawberryWeight,BigDecimal mangoWeight) {
        BigDecimal totalCost = (appleWeight .multiply(applePrice)).add (strawberryWeight .multiply(strawberryPrice)).add(mangoWeight.multiply(mangoPrice));
        return totalCost;
    }
}

