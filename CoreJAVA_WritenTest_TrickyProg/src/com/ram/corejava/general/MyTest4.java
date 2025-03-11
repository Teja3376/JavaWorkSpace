package com.ram.corejava.general;
/*
 Using enum in Switch
  Enums can be used in switch statements, and the switch 
  works with the enum constants.


 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class MyTest4 {
    public static void main(String[] args) {
        Day day = Day.TUESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
        }
    }
}

