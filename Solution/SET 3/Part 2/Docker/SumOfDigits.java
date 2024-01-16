import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Initialize a number to some integer value
        int number = 12345;  // You can change this to any integer value

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(number);

        // Display the result
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }

    // Method to calculate the sum of digits
    private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
