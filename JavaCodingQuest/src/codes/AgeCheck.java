package codes;

import java.util.Scanner;

public class AgeCheck {
      public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)) {

                  System.out.println("How old are you: ");
                  int age = Integer.parseInt(scanner.nextLine());

                  if (age >= 0 && age <= 120) {
                        System.out.println("OK");
                  } else {
                        System.out.println("Impossible");
                  }

            } catch (NumberFormatException e) {

                  e.printStackTrace();
            }
      }
}
