package com.command.log;

import java.io.Serializable;

/**
 * 抽象命令类，由于需要将命令对象写入文件，因此它实现了Serializable接口
 */
public abstract class Command implements Serializable {

    //命令名称
    protected String name;

    //命令参数
    protected String args;

    //维持对接收者对象的引用
    protected ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    //声明两个抽象的执行方法execute()
    public abstract void execute(String args);

    public abstract void execute();
}
