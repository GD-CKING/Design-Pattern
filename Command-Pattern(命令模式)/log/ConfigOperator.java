package com.command.log;

import java.io.Serializable;

/**
 * 配置文件操作类：请求接收者。由于ConfigOperation类的对象是Command的
 * 成员变量，它也将随Command对象一起写入文件，因此ConfigOperator也需要
 * 实现Serializable接口。
 */
public class ConfigOperator implements Serializable {

    public void insert(String args) {
        System.out.println("增加新节点：" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点：" + args);
    }

    public void delete(String args) {
        System.out.println("删除节点：" + args);
    }
}
