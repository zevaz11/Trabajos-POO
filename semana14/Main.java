import models.Animal;
import models.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    Class<?> AnimalClass;
    Class<?> CarClass;

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        //initializeData();
        selectMethod();
    }

    public static void selectMethod()throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException{

        Scanner sc = new Scanner(System.in);

        //variables
        Class<?> temporalClass;
        Constructor<?> temporalConstructor;
        Object temporalObject;
        Method[] temporalMethods;

        String typeClass;
        String typeMethod;
        String option;
        String[] options;

        System.out.println("Select the class you want to modify: ");
        //System.out.println("Select the class you want to modify:\n" + "1. " + AnimalClass.getName() + "\n2. " + CarClass.getName());
        option = sc.nextLine();
        options = option.split("\\.");

        typeClass = options[0];
        typeMethod = options[1];

        temporalClass = Class.forName("models." + options[0]);
        temporalConstructor = temporalClass.getDeclaredConstructor();
        temporalObject = temporalConstructor.newInstance();
        temporalMethods = temporalClass.getDeclaredMethods();

        for (Method method : temporalMethods) {
            if (typeMethod.equals(method.getName())) {
                method.setAccessible(true);
                method.invoke(temporalObject);
                break;
            }
        }

    }

    public static void initializeData()throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException{
        Class<?> PersonClass = Class.forName("models.Person");
        //Constructor<?> constructor = PersonClass.getDeclaredConstructor();
        Constructor<?> constructor1 = PersonClass.getDeclaredConstructor(String.class, int.class);
        Object myPerson = constructor1.newInstance("Sebas", 18);
        System.out.println(myPerson);

        //Person myPerson = new Person("Sebas", 18);
        Field[] myPersonFields = myPerson.getClass().getDeclaredFields();

        for (Field myPersonField : myPersonFields){
            System.out.println(myPersonField.getName());
            if (myPersonField.getName().equals("age")){
                myPersonField.setAccessible(true);
                System.out.println(myPersonField.get(myPerson));
            }
        }

        Method[] myPersonMethods = myPerson.getClass().getDeclaredMethods();
        for (Method myPersonMethod: myPersonMethods){
            if(myPersonMethod.getName().equals("greet")) {
                System.out.println(myPersonMethod.getName());
                myPersonMethod.setAccessible(true);
                myPersonMethod.invoke(myPerson);
            }
        }

        Method greetOtherPersonMethod = myPerson.getClass().getDeclaredMethod("greetOtherPerson", String.class);
        greetOtherPersonMethod.setAccessible(true);
        System.out.println(greetOtherPersonMethod.invoke(null, "Jonathan"));
    }
}