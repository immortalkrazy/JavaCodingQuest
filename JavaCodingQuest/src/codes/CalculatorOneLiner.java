package codes;

import java.util.Scanner;

public class CalculatorOneLiner {

      public static void main(String[] args) {

            System.out.println("Please enter your calculation: ");
            try (Scanner sc = new Scanner(System.in)) {
                  String str = sc.next();
                  result(str);
            }
      }

      public static void result(String str) {

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int index = 0;
            Character op = null;
            for (int i = 0; i < str.length(); i++) {
                  Character c = str.charAt(i);
                  if (c == '+' || c == '-' || c == '*' || c == '/') {
                        op = c;
                        index = i;
                        break;
                  }
            }
            for (int i = 0; i < index; i++) {
                  sb1.append(str.charAt(i));
            }
            for (int i = str.length() - 1; i > index; i--) {
                  sb2.append(str.charAt(i));
            }
            double db1 = Double.valueOf(sb1.toString());
            double db2 = Double.valueOf(sb2.toString());

            switch (op) {
            case '+':
                  System.out.println(db1 + " + " + db2 + " = " + (db1 + db2));
                  break;
            case '-':
                  System.out.println(db1 + " - " + db2 + " = " + (db1 - db2));
                  break;
            case '*':
                  System.out.println(db1 + " * " + db2 + " = " + (db1 * db2));
                  break;
            case '/':
                  System.out.println(db1 + " / " + db2 + " = " + (db1 / db2));
                  break;

            default:
                  System.out.println("Wrong Operator");
                  break;
            }

      }

}
