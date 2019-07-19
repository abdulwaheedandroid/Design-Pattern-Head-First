package com.example.abdulwaheed.designpatterns.command_pattern;

public class LightOffCommand2 implements Command2 {
    private Light light;

    public LightOffCommand2(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.on();
    }
}
