package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args) {
        double areaOfRectangle;
        //java.util.Scanner input;

        Scanner input = new Scanner(System.in);
        //input = new java.util.Scanner(System.in);

        System.out.println("What is the area of the rectangle:");
        areaOfRectangle = input.nextDouble();
        input.close();
        int length = 21;
        int width = 7;

        double answer = length * width;
        System.out.println("Correct answer for area of a rectangle = " + answer);
    }
}
