package codes;

public class Fibonacci {

      // static long array to facilitate fibMemo
      private static long[] fibonacciCache;

      public static void main(String[] args) {

            int num = 92;

            long start1 = System.currentTimeMillis();
//            System.out.println(fib(num));
            long end1 = System.currentTimeMillis();
            System.out.println((end1 - start1) / 1000);

            // array is initialized with n+1
            fibonacciCache = new long[num + 1];
            long start2 = System.currentTimeMillis();
            System.out.println(fibMemo(num));
            long end2 = System.currentTimeMillis();
            System.out.println((end2 - start2) / 1000);

            // print all the fibonacci numbers to the n
            for (int i = 0; i <= num; i++) {
                  System.out.print(fibMemo(i) + " ");
            }
      }

      public static long fib(int num) {

            if (num <= 1)
                  return num;

            return fib(num - 1) + fib(num - 2);
      }

      // memoization technique
      public static long fibMemo(int n) {

            // base case
            if (n <= 1) {
                  return n;
            }

            // this is going to help populate array as it foes through the n length
            // on the other hand will provide the fibonacci number in recusrsive calls
            if (fibonacciCache[n] != 0) {
                  return fibonacciCache[n];
            }

            // array population occurs here
            long nthFibonacciNumber = (fibMemo(n - 1) + fibMemo(n - 2));
            fibonacciCache[n] = nthFibonacciNumber;

            return nthFibonacciNumber;
      }
}