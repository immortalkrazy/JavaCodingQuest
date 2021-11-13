package codes;

import java.util.Scanner;
import java.util.Stack;

public class CheckParenthesis {

      public static void main(String[] args) {

            String s = takeInput();
            boolean result = isMatched(s);
            System.out.println("Answer is: " + result);

      }

      public static String takeInput() {

            System.out.println("Please input values: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            sc.close();
            return str;
      }

      public static boolean isMatched(String str) {

            final String opening = "[{(";
            final String closing = "]})";

            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                  if (opening.indexOf(c) != -1) {
                        stack.push(c);
                  } else if (closing.indexOf(c) != -1) {
                        if (stack.isEmpty()) {
                              return false;
                        }
                        if (closing.indexOf(c) != opening.indexOf(stack.pop())) {
                              return false;
                        }
                  }
            }
            return stack.isEmpty();
      }

      // practice code
      public static boolean isMatch(String str) {

            final String opening = "[{(";
            final String closing = "]})";

            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                  if (opening.indexOf(c) != -1) {
                        stack.push(c);
                  } else if (closing.indexOf(c) != -1) {
                        if (stack.isEmpty()) {
                              return false;
                        }
                        if (closing.indexOf(c) != opening.indexOf(stack.pop())) {
                              return false;
                        }
                  }
            }

            return stack.isEmpty();
      }

}
