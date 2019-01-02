package com.leo.command;

public class GarageDoorOffCommand implements ICommand {

    private GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.off();
    }

    @Override
    public void undo() {
          garageDoor.on();
    }
}
