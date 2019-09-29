package com.command.undo;

/**
 * 客户端测试代码
 */
public class Client {

    public static void main(String[] args) {

        CalculatorForm form = new CalculatorForm();

        AbstractCommand command;
        command = new AddCommand();
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
        form.undo();
        form.undo();
        form.undo();
        form.redo();
        form.redo();
        form.redo();


    }
}
