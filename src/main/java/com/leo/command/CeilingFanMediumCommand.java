package com.leo.command;

public class CeilingFanMediumCommand implements ICommand {

    private CeilingFan ceilingFan;
    int speed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;

    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
