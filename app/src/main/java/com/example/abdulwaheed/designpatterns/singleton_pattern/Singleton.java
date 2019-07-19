package com.example.abdulwaheed.designpatterns.singleton_pattern;

public class Singleton {
    private static Singleton uniqueInstance;

    /*
     * this is the way to eagerly instantiation rather lazy to overcome multi threading problem
     * */
    private static Singleton uniqueInstance2 = new Singleton();

    /*public static Singleton getInstance() {
        return uniqueInstance2;
    }*/
    /*
     * Double checked locking to reduce the use of synchronization in getInstance()
     * volatile keyword ensures that multiple threads handle the uniqueInstace variable correctly
     * when it is being initialized to the singleton instance
     * */
    private volatile static Singleton uniqueInstance3;

    private Singleton() {
        //this constructor is private just make sure only this class can instantiate
    }

    //for thread safety purposes

   /* public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }*/

    //this way of instantiating is called lazy instantiation
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

   /*public static Singleton getInstance() {
       if (uniqueInstance3 == null) {
           synchronized (Singleton.class) {
               if (uniqueInstance3 == null) {
                   uniqueInstance3 = new Singleton();
               }
           }
       }
       return uniqueInstance3;
   }*/
}
