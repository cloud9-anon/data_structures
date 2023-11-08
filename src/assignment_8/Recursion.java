package assignment_8;

import java.util.Scanner;

public class Recursion {

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }
    }

    public static int square(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + square(num - 1);
        }
    }

    public static int factorial(int num, int result) {
        if (num == 0) {
            return result;
        } else {
            return factorial(num - 1, result * num);
        }
    }

    public static boolean isPalindrome(int num) {
        int reversed = reverseNumber(num);
        return num == reversed;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " + sum);

        int squareResult = square(num);
        System.out.println("Square of the number: " + squareResult);

        int factorialResult = factorial(num, 1);
        System.out.println("Factorial of the number: " + factorialResult);

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }
}
