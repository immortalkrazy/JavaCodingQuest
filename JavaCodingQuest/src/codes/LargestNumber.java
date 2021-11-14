package codes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestNumber {

      private static Scanner sc;

      public static void main(String[] args) {

            ArrayList<Number> list = getInputValues();
            System.out.println("Largest Number is: " + getLargestNumber(list));

      }

      public static ArrayList<Number> getInputValues() {

            ArrayList<Number> list = new ArrayList<>();

            try {
                  sc = new Scanner(System.in);

                  System.out.println("Please input values");

                  for (int i = 0; i < 5; i++) {
                        list.add(sc.nextDouble());
                  }

            } catch (IllegalArgumentException e) {
                  System.out.println("IllegalArgument");
                  getInputValues();
            } catch (InputMismatchException e) {
                  System.out.println("InputMismatch");
                  getInputValues();
            } catch (Exception e) {
                  System.out.println(e.toString());
            }
            return list;

      }

      public static Number getLargestNumber(ArrayList<Number> list) {

            if (list == null || list.size() == 0) {
                  return null;
            }

            Number number = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                  if (number.doubleValue() < list.get(i).doubleValue()) {
                        number = list.get(i);
                  }
            }
            return number;
      }

}
