package com.example.demo;

import com.example.demo.seviceimpl.*;

import java.math.BigDecimal;

public class Cost {
    public static void main(String[] args) {
        StrategyContext strategyOne  = new StrategyContext(new StrategyOne());
        System.out.println("题目一水果花费"+strategyOne.executeStrategy(BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(0)));
        StrategyContext strategyTwo  = new StrategyContext(new StrategyTwo());
        System.out.println("题目二水果花费"+strategyTwo.executeStrategy(BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1)));
        StrategyContext strategyThree  = new StrategyContext(new StrategyThree());
        System.out.println("题目三水果花费"+strategyThree.executeStrategy(BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1)));
        StrategyContext strategyFoure  = new StrategyContext(new StrategyFoure());
        System.out.println("题目四水果花费"+strategyFoure.executeStrategy(BigDecimal.valueOf(100),BigDecimal.valueOf(1),BigDecimal.valueOf(1)));
    }

}
