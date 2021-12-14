package codes;

public class BreakContinue {

      public static void main(String[] args) {
            useBreak(10);
            useContinue(5);
      }

      public static void useBreak(int num) {

            int number = 0;
            int sum = 0;
            while (number < num) {
                  number++;
                  sum += number;
                  if (sum >= 28) {
                        break;
                  }
            }
            System.out.println("The number is: " + number);
            System.out.println("The sum    is: " + sum);
      }

      public static void useContinue(int num) {

            int number = 0;
            int sum = 0;
            while (number < num) {
                  number++;
                  if (number == 3 || number == 4) {
                        continue;
                  }
                  sum += number;
            }
            System.out.println("The number is: " + number);
            System.out.println("The sum    is: " + sum);
      }

}
