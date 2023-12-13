import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

    
    //int    number = 5; // replace 5 with the number you want the multiplication table for

       Scanner reader = new Scanner(System.in);
       System.out.print("\nEnter the number: ");
        int number = reader.nextInt();
        System.out.println("Multiplication Table for " + number + ":");

       int counter = 1;

        while (counter <= 10) {
            System.out.println(number + " x " + counter + " = " + number * counter);
            counter++;
        }
    }
}