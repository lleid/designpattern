package com.leo.command;


/**
 * 远程控制开关      7对 1开1关
 */
public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;

    public RemoteControl() {
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int i, ICommand onCommand, ICommand offCommand) {
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    /**
     * 开
     *
     * @param slot 槽位
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    /**
     * 关
     *
     * @param slot 槽位
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
