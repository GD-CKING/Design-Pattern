package com.bridge;

public class Client {

    public static void main(String[] args) {
        ImageImp imp = new WindowsImp();
        Image image = new JPGImage();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
