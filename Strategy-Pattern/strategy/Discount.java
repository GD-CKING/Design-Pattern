package com.strategy;

/**
 * 折扣类：抽象策略类
 */
public interface Discount {
    public double calculate(double price);
}
