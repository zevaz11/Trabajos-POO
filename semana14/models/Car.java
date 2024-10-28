package models;

public class Car {

    public static String color;
    static boolean lights;
    public Car(){
        color = "Blue";
        lights = false;
    }

    private static void turnLightsOn(){
        System.out.println("Lights On");
        lights = true;
    }

    private static void printColor(){
        System.out.println("Car's color: " + color);
    }
}
