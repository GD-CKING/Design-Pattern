package com.face;

public class Client {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("D:\\sjms\\src\\com\\face\\facade\\src.txt", "D:\\sjms\\src\\com\\face\\facade\\des.txt");
    }
}
