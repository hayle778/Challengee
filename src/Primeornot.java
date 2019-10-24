// Java Program to Check Prime Number using For Loop
import java.util.Scanner;

public class Primeornot {
    private static Scanner sc;

    public static void main(String[] args) {
        int R, number, count = 0;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        for (R = 2; R <= number / 2; R++)  //
        {
            if (number % R == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && number != 1) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is Not a Prime Number");
        }
    }
}