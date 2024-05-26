package com.example.demo.seviceimpl;

import com.example.demo.sevice.PromotionStrategy;

import java.math.BigDecimal;

import static com.example.demo.constant.FruitCostOne.applePrice;
import static com.example.demo.constant.FruitCostOne.strawberryPrice;
import static com.example.demo.constant.FruitCostTwo.mangoPrice;

/**
 * 草莓限时打 8 折
 */
public class StrategyThree implements PromotionStrategy {
    /**
     * 苹果和草莓
     * @param appleWeight
     * @param strawberryWeight
     * @param mangoWeight
     * @return
     */
    @Override
    public BigDecimal calculateDiscount(BigDecimal appleWeight, BigDecimal strawberryWeight,BigDecimal mangoWeight) {
        BigDecimal totalCost = (appleWeight .multiply(applePrice)).add(strawberryWeight.multiply(strawberryPrice).multiply(strawberryWeight).multiply(BigDecimal.valueOf(0.8))).add(mangoWeight.multiply(mangoPrice));
        return totalCost;
    }
}

