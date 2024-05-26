package com.example.demo.seviceimpl;

import com.example.demo.sevice.PromotionStrategy;

import java.math.BigDecimal;

import static com.example.demo.constant.FruitCostOne.applePrice;
import static com.example.demo.constant.FruitCostOne.strawberryPrice;
import static com.example.demo.constant.FruitCostTwo.mangoPrice;

/**
 * 草莓限时打 8 折
 */
public class StrategyFoure implements PromotionStrategy {
    /**
     * 购物满 100 减 10 块
     * @param appleWeight
     * @param strawberryWeight
     * @param mangoWeight
     * @return
     */
    @Override
    public BigDecimal calculateDiscount(BigDecimal appleWeight, BigDecimal strawberryWeight,BigDecimal mangoWeight) {
        BigDecimal totalCost = (appleWeight .multiply(applePrice)).add (strawberryWeight .multiply(strawberryPrice)).add(mangoWeight.multiply(mangoPrice));
        if(totalCost.compareTo(BigDecimal.valueOf(100))>=0){
            totalCost = totalCost.subtract(BigDecimal.valueOf(10));
        }
        return totalCost;
    }
}

