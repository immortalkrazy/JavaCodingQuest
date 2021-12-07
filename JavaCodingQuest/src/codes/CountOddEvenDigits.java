package codes;

public class CountOddEvenDigits {

      public static void main(String[] args) {

            int num = 123456;
            printOddEvenCount(num);

      }

      public static void printOddEvenCount(int num) {

            int cntOdd = 0;
            int cntEven = 0;

            while (num > 0) {

                  int remainder = num % 10;
                  if (remainder % 2 == 0) {
                        cntEven++;
                  } else {
                        cntOdd++;
                  }
                  num = num / 10;
            }
            System.out.println("Even Count is: " + cntEven + "\n&Odd Count is: " + cntOdd);
      }
}
