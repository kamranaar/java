import java.math.BigInteger;

public class fibo {

    public static BigInteger fib(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 10000; // Calculate the 100th Fibonacci number
        BigInteger fibonacciNumber = fib(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
        System.out.println("Calculation took: " + duration + " milliseconds");
    }
}
