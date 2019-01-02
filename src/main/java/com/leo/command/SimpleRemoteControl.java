package com.leo.command;

public class SimpleRemoteControl {
    ICommand slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(ICommand command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
