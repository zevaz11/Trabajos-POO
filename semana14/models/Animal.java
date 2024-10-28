package models;

public class Animal {
    static String type;
    static boolean hungry;
    public Animal(){
         type = "Tiger";
         hungry = true;
    }

    private static void feedAnimal(){
        hungry = true;
        System.out.println("The animal was feed correctly");
    }

    private static void printType(){
        System.out.println("Animal type: " + type);
    }
}
