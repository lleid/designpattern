package com.leo.command;


public class RemoteControlWithUndo {
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private ICommand undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int i, ICommand onCommand, ICommand offCommand) {
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * 撤销操作
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
