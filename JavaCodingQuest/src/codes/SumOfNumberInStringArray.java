package codes;

import java.util.Scanner;

public class SumOfNumberInStringArray {

      public static void main(String[] args) {

            String arr[] = { "2AA", "B3C", "Z27", "LM6", "BAC" };
            System.out.println("Sum of Integers in array is:     " + sumOfNumbers(arr));

            String arr2[] = makeStringArray();
            System.out.println("Sum of Integers in array is:     " + sumOfNumbers(arr2));
      }

      public static int sumOfNumbers(String[] strArray) {

            int sum = 0;

            for (int i = 0; i < strArray.length; i++) {

                  String strElement = strArray[i];

                  for (int j = 0; j < strElement.length(); j++) {

                        if (Character.isDigit(strElement.charAt(j))) {

                              sum = sum + Integer.parseInt(strElement.charAt(j) + "");
                        }
                  }
            }
            return sum;
      }

      public static String[] makeStringArray() {

            try (Scanner sc = new Scanner(System.in)) {
                  System.out.println("What is the character length of Array: ");
                  int arrLength = sc.nextInt();
                  System.out.println("Please enter the elements now: ");

                  String[] arr = new String[arrLength];

                  for (int i = 0; i < arrLength; i++) {
                        String str = sc.next();
                        arr[i] = str;
                  }

                  return arr;
            }

      }
}