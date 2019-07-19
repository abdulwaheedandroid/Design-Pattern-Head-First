package com.example.abdulwaheed.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.abdulwaheed.designpatterns.adapter_pattern.TurkeyAdaper;
import com.example.abdulwaheed.designpatterns.adapter_pattern.WildTurkey;
import com.example.abdulwaheed.designpatterns.command_pattern.CeilingFan;
import com.example.abdulwaheed.designpatterns.command_pattern.CeilingFanHighCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.CeilingFanMediumCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.CeilingFanOffCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.CeilingFanOnCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.Command;
import com.example.abdulwaheed.designpatterns.command_pattern.GarageDoor;
import com.example.abdulwaheed.designpatterns.command_pattern.GarageDoorDownCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.GarageDoorUpCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.Light;
import com.example.abdulwaheed.designpatterns.command_pattern.LightOffCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.LightOffCommand2;
import com.example.abdulwaheed.designpatterns.command_pattern.LightOnCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.LightOnCommand2;
import com.example.abdulwaheed.designpatterns.command_pattern.MacroCommand;
import com.example.abdulwaheed.designpatterns.command_pattern.RemoteControl;
import com.example.abdulwaheed.designpatterns.command_pattern.RemoteControlWithUndo;
import com.example.abdulwaheed.designpatterns.command_pattern.SimpleRemoteControl;
import com.example.abdulwaheed.designpatterns.command_pattern.Stereo;
import com.example.abdulwaheed.designpatterns.command_pattern.StereoOnWithCDCommand;
import com.example.abdulwaheed.designpatterns.decorator_pattern.Beverage;
import com.example.abdulwaheed.designpatterns.decorator_pattern.EspressoBeverage;
import com.example.abdulwaheed.designpatterns.decorator_pattern.HouseBlend;
import com.example.abdulwaheed.designpatterns.decorator_pattern.Mocha;
import com.example.abdulwaheed.designpatterns.facad_pattern.Amplifier;
import com.example.abdulwaheed.designpatterns.facad_pattern.CDPlayer;
import com.example.abdulwaheed.designpatterns.facad_pattern.DvdPlayer;
import com.example.abdulwaheed.designpatterns.facad_pattern.HomeTheaterFacade;
import com.example.abdulwaheed.designpatterns.facad_pattern.PopcornPopper;
import com.example.abdulwaheed.designpatterns.facad_pattern.Projector;
import com.example.abdulwaheed.designpatterns.facad_pattern.Screen;
import com.example.abdulwaheed.designpatterns.facad_pattern.TheaterLights;
import com.example.abdulwaheed.designpatterns.facad_pattern.Tuner;
import com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.ChicagoStylePizzaStore;
import com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.NYStylePizzaStore;
import com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.Pizza;
import com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.PizzaStore;
import com.example.abdulwaheed.designpatterns.iterator_pattern.DinerMenu;
import com.example.abdulwaheed.designpatterns.iterator_pattern.PenCakHouseMenu;
import com.example.abdulwaheed.designpatterns.iterator_pattern.Waitress;
import com.example.abdulwaheed.designpatterns.observer_pattern.CurrentConditionDisplay;
import com.example.abdulwaheed.designpatterns.observer_pattern.WeatherData;
import com.example.abdulwaheed.designpatterns.state_pattern.GumballMachine;
import com.example.abdulwaheed.designpatterns.strategy_pattern.Duck;
import com.example.abdulwaheed.designpatterns.strategy_pattern.FlyRocketPowered;
import com.example.abdulwaheed.designpatterns.strategy_pattern.MallardDuck;
import com.example.abdulwaheed.designpatterns.strategy_pattern.ModelDuck;
import com.example.abdulwaheed.designpatterns.template_method_pattern.MyCoffeeWithHook;
import com.example.abdulwaheed.designpatterns.template_method_pattern.MyTea;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*This is the simulation of compound patter*/



        /*This is the simulation of state pattern*/

        GumballMachine gumballMachine = new GumballMachine(5);
        Log.e(TAG, gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        Log.e(TAG, gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        Log.e(TAG, gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        Log.e(TAG, gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        Log.e(TAG, gumballMachine.toString());




        /*
         * This is the simulation of iterator pattern
         *
         * */

        PenCakHouseMenu penCakHouseMenu = new PenCakHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(penCakHouseMenu, dinerMenu);
        waitress.printMenu();

        /*
         * This is the simulation of template method pattern
         *
         * */

        MyTea myTea = new MyTea();
        myTea.prepareRecipe();

        MyCoffeeWithHook myCoffeeWithHook = new MyCoffeeWithHook();
        myCoffeeWithHook.prepareRecipe();

        /*
         * This is the simulation of facade pattern
         *
         * */

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(),
                new CDPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());

        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();

        /*
         * This is the simulation of adapter and facade pattern
         *
         * */

        com.example.abdulwaheed.designpatterns.adapter_pattern.MallardDuck mallardDuck = new com.example.abdulwaheed.designpatterns.adapter_pattern.MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        com.example.abdulwaheed.designpatterns.adapter_pattern.Duck turkeyAdapter = new TurkeyAdaper(wildTurkey);
        Log.i(TAG, "Turkey Says...;");

        wildTurkey.fly();
        wildTurkey.gobble();

        Log.i(TAG, "Duck Says...;");

        testDuck(mallardDuck);

        Log.i(TAG, "Turkey Adapter Says...;");
        testDuck(turkeyAdapter);


        /*
         * This is simulation of command pattern
         * */

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("testing");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room Light");
        Light kitchenLight = new Light("Kitchen Light");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage Door");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOnCommand livingRomLightOn = new LightOnCommand(livingRoomLight);

        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOnWithCDCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        Light livingRoomLightForUndoTesting = new Light("Living Room Light");
        LightOnCommand2 livingRomLightOnForUndoTesting = new LightOnCommand2(livingRoomLightForUndoTesting);
        LightOffCommand2 livingRoomLightOffForUndoTesting = new LightOffCommand2(livingRoomLightForUndoTesting);

        remoteControlWithUndo.setCommand(0, livingRomLightOnForUndoTesting, livingRoomLightOffForUndoTesting);
        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.setCommand(0, ceilingFanMediumCommand, ceilingFanMediumCommand);
        remoteControlWithUndo.setCommand(1, ceilingFanHighCommand, ceilingFanMediumCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();

        Command[] partyOn = {livingRomLightOn, stereoOnWithCDCommand};
        Command[] partyOff = {livingRoomLightOff, stereoOnWithCDCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControlWithUndo.setCommand(0, partyOnMacro, partyOffMacro);

        /*
         * This is simulation of Factory Pattern
         * */
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        Log.i(TAG, "Ethan Ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("Cheese");
        Log.i(TAG, "Joel Ordered a " + pizza.getName());


        /*
         * This is simulation of Decorator Pattern
         * */
        Beverage beverage = new EspressoBeverage();
        Log.i(TAG, beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);

        Log.i(TAG, beverage1.getDescription() + " $" + beverage1.cost());

        /*
         * this is simulation of observer pattern. This is pattern no 02
         * */

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(-2f, 40.5f, 40f);

        /*
         * This is simulation of duck via Strategy Pattern. This is pattern no 01
         * */

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }

    private void testDuck(com.example.abdulwaheed.designpatterns.adapter_pattern.Duck turkeyAdapter) {
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
