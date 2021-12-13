package codes;

import java.util.Scanner;

public class ReversingName {
      public static void main(String[] args) {

            try (Scanner sc = new Scanner(System.in)) {

                  System.out.println("Type your name:");
                  String name = sc.nextLine();
//           
                  System.out.println("Name is Reverse Order: " + reverseName(name));
            }
      }

      public static String reverseName(String str) {

            String revName = "";
            int numberOfChars = str.length();
            int ctr = 1;

            while (ctr <= numberOfChars) {
                  char charAtPos = str.charAt(numberOfChars - ctr);
                  revName = revName + charAtPos;
                  ctr++;
            }
            return revName;
      }

}
