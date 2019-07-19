package com.example.abdulwaheed.designpatterns.command_pattern;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        NoCommand noCommand = new NoCommand();
        for (int a = 0; a < 7; a++) {
            onCommands[a] = noCommand;
            offCommands[a] = noCommand;
        }
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
