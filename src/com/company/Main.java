package com.company;

public class Main {

    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        System.out.println("Default fan:");
        System.out.println(defaultFan);
        System.out.println("Fan 1:");
        Fan fan1 = new Fan(defaultFan.FAST, true,10,"yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(defaultFan.MEDIUM,true,5,"blue");
        System.out.println("Fan 2:");
        System.out.println(fan2);

    }
}
