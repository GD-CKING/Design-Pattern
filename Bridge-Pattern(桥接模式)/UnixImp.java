package com.bridge;

/**
 * UNIX操作系统实现类：具体实现类
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在UNIX操作系统中显示图像：");
    }
}
