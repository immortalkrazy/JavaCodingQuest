package codes;

public class CountDigits {

      public static void main(String[] args) {

            int num = 235824554;

            System.out.println("Count of Numbers is: " + countIterative(num));
            System.out.println("Count of Numbers is: " + countRecursive(num));
            System.out.println("Count of Numbers is: " + countString(num));
      }

      public static int countIterative(int num) {

            int cnt = 0;

            while (num != 0) {
                  num = num / 10;
                  cnt++;
            }
            return cnt;
      }

      public static int countRecursive(int num) {

            if (num == 0) {
                  return 0;
            }
            return 1 + countRecursive(num / 10);
      }

      public static int countString(int num) {

            return String.valueOf(num).length();

      }

}
