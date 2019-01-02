package com.leo.command;

public class CeilingFanOffCommand implements ICommand {

    private CeilingFan ceilingFan;
    int speed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;

    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (speed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (speed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (speed == CeilingFan.LOW) {
            ceilingFan.low();
        } else {
            ceilingFan.off();
        }
    }
}
