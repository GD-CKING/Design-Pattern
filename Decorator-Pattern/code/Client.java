package com.decorator;

public class Client {

    public static void main(String[] args) {
        Component component, componentSB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();
    }
}
