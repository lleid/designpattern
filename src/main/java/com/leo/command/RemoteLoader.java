package com.leo.command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);

        Stereo stereo = new Stereo();
        StereOnWithCDCommand stereOnWithCDCommand = new StereOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOnCommand, garageDoorOffCommand);
        remoteControl.setCommand(2, stereOnWithCDCommand, stereoOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println("-------------------------------------------");

        RemoteControlWithUndo remoteControlWithUndo1 = new RemoteControlWithUndo();

        LightOnCommand lightOnCommand1 = new LightOnCommand(light);
        LightOffCommand lightOffCommand1 = new LightOffCommand(light);

        remoteControlWithUndo1.setCommand(0, lightOnCommand1, lightOffCommand1);
        remoteControlWithUndo1.onButtonWasPushed(0);
        remoteControlWithUndo1.offButtonWasPushed(0);
        remoteControlWithUndo1.undoButtonWasPushed();


        System.out.println("-------------------------------------------");

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("living room ");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);


        System.out.println("-------------------------------------------");

        RemoteControlWithUndo remoteControlWithUndo2 = new RemoteControlWithUndo();

        ICommand[] partyOn = new ICommand[]{lightOnCommand, stereOnWithCDCommand, ceilingFanHighCommand};
        ICommand[] partyOff = new ICommand[]{lightOffCommand, stereoOffCommand, ceilingFanOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControlWithUndo2.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControlWithUndo2.onButtonWasPushed(0);
        remoteControlWithUndo2.offButtonWasPushed(0);

    }
}
