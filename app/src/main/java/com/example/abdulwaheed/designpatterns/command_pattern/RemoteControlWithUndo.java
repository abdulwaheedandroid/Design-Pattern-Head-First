package com.example.abdulwaheed.designpatterns.command_pattern;

public class RemoteControlWithUndo {
    Command2[] onCommands;
    Command2[] offCommands;
    Command2 undoCommand;
    MacroCommand macroCommandOn;
    MacroCommand macroCommandOff;

    public RemoteControlWithUndo() {
        onCommands = new Command2[7];
        offCommands = new Command2[7];

        NoCommand2 noCommand = new NoCommand2();
        for (int a = 0; a < 7; a++) {
            onCommands[a] = noCommand;
            offCommands[a] = noCommand;
        }
    }

    public void setCommand(int slot, Command2 onCommand, Command2 offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void setCommand(int slot, MacroCommand macroCommandOn, MacroCommand macroCommandOff) {
        this.macroCommandOn = macroCommandOn;
        this.macroCommandOff = macroCommandOff;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
