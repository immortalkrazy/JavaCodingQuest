package codes;

public class Fibonacci {

      private static long[] fibonacciCache;

      public static void main(String[] args) {

            int num = 50;

            long start1 = System.currentTimeMillis();
            System.out.println(fib(num));
            long end1 = System.currentTimeMillis();
            System.out.println((end1 - start1) / 1000);

            fibonacciCache = new long[num + 1];
            long start2 = System.currentTimeMillis();
            System.out.println(fibMemo(num));
            long end2 = System.currentTimeMillis();
            System.out.println((end2 - start2) / 1000);
      }

      public static long fib(int num) {

            if (num <= 1)
                  return num;

            return fib(num - 1) + fib(num - 2);
      }

      public static long fibMemo(int n) {

            if (n <= 1) {
                  return n;
            }

            if (fibonacciCache[n] != 0) {
                  return fibonacciCache[n];
            }

            long nthFibonacciNumber = (fibMemo(n - 1) + fibMemo(n - 2));
            fibonacciCache[n] = nthFibonacciNumber;

            return nthFibonacciNumber;
      }
}