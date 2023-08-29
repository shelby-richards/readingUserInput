/*
Hint:
Use a while loop or a do/while loop
Use a scanner object method
integer.parseINT
Need local variables to count integers as well as sum integers
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum =0;
        while (count <=5) {
            System.out.println("Enter number #" + count + ":");
            String input = sc.nextLine();
            try {
                double number = Double.parseDouble(input);
                count++;
                sum += number;

            }catch (NumberFormatException nfe){
                System.out.println("Invalid number.");
            }
        }
        System.out.println("The sum of your five numbers is: " + sum);
    }
}