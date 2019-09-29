package com.command.undo;

import java.util.Stack;

/**
 * 具体命令类
 */
public class AddCommand extends AbstractCommand{

    private Adder adder = new Adder();


    Stack<Integer> undoStack = new Stack<>();

    Stack<Integer> redoStack = new Stack<>();

    /**
     * 实现抽象命令类中声明的execute()方法，调用加法类的加法操作
     * @param value
     * @return
     */
    @Override
    public int execute(int value) {

        undoStack.push(value);
        return adder.add(value);
    }

    /**
     * 实现抽象命令类中声明的undo()方法，通过增加一个相反数来实现加法的逆向操作
     * @return
     */
    @Override
    public int undo() {
        if(undoStack.size() != 0) {
            int value = undoStack.pop();
            redoStack.push(value);
            return adder.add(-value);
        }else {
            return 0;
        }
    }

    /**
     * 实现抽象命令类中声明的redo()方法
     * @return
     */
    @Override
    public int redo() {

        if(redoStack.size() != 0) {
            int value = redoStack.pop();
            undoStack.push(value);
            return adder.add(value);
        }else {
            return adder.add(0);
        }
    }


}
