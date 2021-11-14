package codes;

import java.util.Scanner;

public class ReversingName {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Type your name:");
            String name = sc.nextLine();
            int numberOfChars = name.length();
            System.out.println(numberOfChars);

            String reversedName = "";
            int counter = 1;

            while (counter <= numberOfChars) {
                  char charAtPosition = name.charAt(numberOfChars - counter);
                  reversedName = reversedName + charAtPosition;
                  counter++;
            }

            System.out.println("Name is Reverse Order: " + reversedName);
            sc.close();
      }
}
