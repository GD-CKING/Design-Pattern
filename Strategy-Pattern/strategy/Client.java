package com.strategy;

public class Client {


    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        mt.setPrice(originalPrice);

        System.out.println("原始票价为：" + originalPrice);
        System.out.println("------------------");

        Discount discount = new ChildrenDiscount();
        mt.setDiscount(discount);

        currentPrice = mt.getPrice();
        System.out.println("折后价为：" + currentPrice);
    }


}
