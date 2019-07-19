package com.example.abdulwaheed.designpatterns.command_pattern;

public class MacroCommand implements Command2 {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int a = 0; a < commands.length; a++) {
            commands[a].execute();
        }
    }

    @Override
    public void undo() {

    }
}
