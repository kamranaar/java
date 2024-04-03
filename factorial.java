import java.math.BigInteger;

public class factorial {

    // Recursive method to find factorial of a given number using BigInteger
    public static BigInteger factorial(BigInteger n) {
        // Base case: if n is 0, factorial is 1
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        // Recursive case: n! = n * (n-1)!
        else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        int number = 500; // Example number, can be more than 500
        BigInteger bigNumber = BigInteger.valueOf(number); // Convert int to BigInteger
        BigInteger result = factorial(bigNumber);

        System.out.println("The factorial of " + number + " is: " + result);
    }
}
