package codes;

import java.util.Scanner;

public class PyramidOfNumbers {

      public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("How High?");
            int noOfRows = scanner.nextInt();

            pyramidONE(noOfRows);
            pyramidTWO(noOfRows);

            scanner.close();
      }

      public static void pyramidONE(int rows) {

            int rowCount = 1;
            for (int i = rows; i > 0; i--) {

                  for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                  }

                  for (int k = 1; k <= rowCount; k++) {
                        System.out.print(rowCount + " ");
                  }

                  System.out.println();
                  rowCount++;
            }

      }

      public static void pyramidTWO(int rows) {

            int rowCount = 1;

            for (int i = rows; i > 0; i--) {

                  for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                  }

                  for (int k = 1; k <= rowCount; k++) {
                        System.out.print(k + " ");
                  }
                  System.out.println();
                  rowCount++;
            }
      }

      public static void pyramidTHREE(int rows) {

      }

      public static void pyramidFour(int rows) {

      }

}
