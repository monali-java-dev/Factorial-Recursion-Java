package com.factorial;



import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // base case
        } else if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        if (result != -1) {
            System.out.println("Factorial of " + num + " is: " + result);
        }

        sc.close();
    }
}