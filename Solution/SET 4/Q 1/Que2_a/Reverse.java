

public class ReverseNumber {
    public static void main(String[] args) {
        
        int originalNumber = 12345;

        
        int reversedNumber = reverseDigits(originalNumber);

       
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }

   
    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}

