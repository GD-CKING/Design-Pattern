package com.bridge;

/**
 * BMP格式图像：扩充抽象类
 */
class BMPImage extends Image{
    @Override
    public void parseFile(String fileName) {
        //解析模拟BMP文件并获得一个对象矩阵对象m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为BMP");
    }
}
