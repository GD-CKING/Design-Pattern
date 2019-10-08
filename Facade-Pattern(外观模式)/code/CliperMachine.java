package com.face;

/**
 * 数据加密类：子系统类
 */
public class CliperMachine {

    public String encrypt(String plainText) {
        final StringBuilder sb = new StringBuilder();
        System.out.println("数据加密，将明文转换为密文：");
        for(int i = 0; i < plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            sb.append(c);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
