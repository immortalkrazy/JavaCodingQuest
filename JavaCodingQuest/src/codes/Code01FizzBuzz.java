package codes;

public class Code01FizzBuzz {

      public static void main(String[] args) {

            printFuzzBizz(99);

      }

      public static void printFuzzBizz(int n) {
            for (int i = 1; i <= n; i++) {
                  if ((i % 3 == 0) && (i % 5 == 0)) {
                        System.out.println("Fuzz Bizz");
                  } else if (i % 3 == 0) {
                        System.out.println("Fuzz");
                  } else if (i % 5 == 0) {
                        System.out.println("Bizz");
                  } else {
                        System.out.println(i);
                  }
            }
      }

}
