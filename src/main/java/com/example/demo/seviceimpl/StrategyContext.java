package com.example.demo.seviceimpl;

import com.example.demo.sevice.PromotionStrategy;

import java.math.BigDecimal;

public class StrategyContext {
    private PromotionStrategy promotionStrategy;

    public StrategyContext(PromotionStrategy strategy) {
        this.promotionStrategy = strategy;
    }

    /**
     *
     * @param appleWeight  苹果重量
     * @param strawberryWeight 草莓重量
     * @param mangoWeight 梨重量
     * @return
     */
    public BigDecimal executeStrategy(BigDecimal appleWeight, BigDecimal strawberryWeight,BigDecimal mangoWeight) {
        return promotionStrategy.calculateDiscount(appleWeight,strawberryWeight,mangoWeight);
    }
}