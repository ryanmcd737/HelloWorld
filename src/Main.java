import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        char secondCharacter = userInput.charAt(1);
        System.out.println(secondCharacter);

        System.out.println("Contains: " + userInput.contains("enter".toLowerCase()));

        /*
        System.out.println("Hello World");
        System.out.println("Ryan");

        Car myCar = new Car( 25.5, "1BC32E", Color.BLUE,  true);

        Car sallyCar = new Car( 13.9,  "3D20BN", Color.BLACK, false);

        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);

        System.out.println("My Car's Color: " + myCar.paintColor);
        myCar.changePaintColor(Color.RED);
        System.out.println("My Car's Color: " + myCar.paintColor);
        */

    }
}
