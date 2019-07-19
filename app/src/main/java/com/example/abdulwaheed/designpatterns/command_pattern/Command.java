package com.example.abdulwaheed.designpatterns.command_pattern;

public interface Command {
    /*
     * 1) Command is  ==> waitress
     * 2) Short Order cook is ==> execute
     * 3) order up is ==> client
     * 4) order is ==> invoker
     * 5) customer is ==> receiver
     * 6) takeOrder is ==> setCommand
     * */

    /*
     * this is order up method for waitress in terms of execute
     * */
    void execute();

}
