import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello world!");

        // Declare an integer variable called num and
        // assigned it a start value of 0
        int num = 0;

        /* Multi-line comment
        .
        .
        .
         */

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = keyboard.nextInt();
        System.out.println(num);

        // new comment
    }
}

