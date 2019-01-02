package com.leo.command;


public class NoCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("do not hava any command");
    }

    @Override
    public void undo() {
        System.out.println("do not hava any command");
    }
}
