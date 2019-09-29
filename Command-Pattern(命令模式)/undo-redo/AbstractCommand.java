package com.command.undo;

/**
 * 抽象命令类
 */
public abstract class AbstractCommand {

    /**
     * 声明命令执行方法execute()
     * @param value
     * @return
     */
    public abstract int execute(int value);

    /**
     * 声明撤销方法undo()
     * @return
     */
    public abstract int undo();

    /**
     * 声明回复方法redo()
     * @return
     */
    public abstract int redo();
}
