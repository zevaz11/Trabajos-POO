import java.util.Scanner;

public class Piramide {

    public void constructPyramid(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the height of your pyramid: ");
        String answer = scanner.nextLine();
        int height = Integer.parseInt(answer); //string to int
        //print the pyramid
        for (int i = 1; i <= height; i++) {
            System.out.print(" ".repeat(height - i));
            System.out.println("*".repeat(2 * i - 1));
        }
        System.out.println("Height: " + height);
    }
}
