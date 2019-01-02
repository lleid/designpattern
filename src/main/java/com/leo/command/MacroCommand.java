package com.leo.command;

/**
 * 宏命令 一组操作
 */
public class MacroCommand implements ICommand {

    ICommand[] iCommands;

    public MacroCommand(ICommand[] iCommands) {
        this.iCommands = iCommands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < iCommands.length; i++) {
            iCommands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < iCommands.length; i++) {
            iCommands[i].undo();
        }
    }
}
