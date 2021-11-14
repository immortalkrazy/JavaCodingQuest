package codes;

public class ReverseString {

      public static void main(String[] args) {

            String str = "Hello World!";
            // Use of StringBuffer
            System.out.println(reverseUsingStringBuffer(str));
            // Iterative Method
            reverseIterating(str);
            // Recursive method
            System.out.println(recursiveMethod(str));
      }

      public static String reverseUsingStringBuffer(String str) {

            StringBuffer sbf = new StringBuffer(str);
            StringBuffer reverse = sbf.reverse();
            String rString = reverse.toString();
            return rString;
      }

      public static void reverseIterating(String str) {

            char[] strArray = str.toCharArray();

            for (int i = strArray.length - 1; i >= 0; i--) {

                  System.out.print(strArray[i]);
            }
            System.out.println();
      }

      public static String recursiveMethod(String str) {

            if ((str == null) || str.length() <= 1) {
                  return str;
            }

            return recursiveMethod(str.substring(1)) + str.charAt(0);
      }
}
