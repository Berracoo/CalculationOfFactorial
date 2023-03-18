import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = num.nextInt();
        System.out.println();
        int factorial = 1;

        for (int i = 1; i <= number; i++ ){

            factorial *= i;

        }
        // if you like to see all steps of the factorial you can write it into the loop and change the number with i.
        System.out.println("The factorial until the given number is : " + number + ". " + "factorial = " + factorial);
    }
}