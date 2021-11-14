package codes;

public class AddTwoDigitNumber {

      public static void main(String[] args) {
            // TODO Auto-generated method stub

//            System.out.println(29 / 10);
//            System.out.println(29 % 10);
            System.out.println(addTwoDigits(29));
      }

      public static int addTwoDigits(int n) {
            int num1 = n / 10;
            int num2 = n % 10;
            System.out.println(num1);
            System.out.println(num2);
            return num1 + num2;

      }

}
