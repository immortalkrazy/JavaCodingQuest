package codes;

public class RomanToInt {

      public static void main(String[] args) {

            System.out.println(romanToInt("XXVII"));
            System.out.println(romanToInt("XXIV"));

      }

      public static int romanToInt(String str) {

            return romanToInt(str, 0, str.length() - 1);

      }

      private static int romanToInt(String str, int prev, int index) {
            if (index < 0) {
                  return 0;
            }

            int result = getCharValue(str.charAt(index));

            if (prev > result) {

                  return romanToInt(str, result, index - 1) - result;

            } else {

                  return result + romanToInt(str, result, index - 1);
            }
      }

      private static int getCharValue(char c) {
            switch (c) {
            case 'I':
                  return 1;
            case 'V':
                  return 5;
            case 'X':
                  return 10;
            case 'L':
                  return 50;
            case 'C':
                  return 100;
            case 'D':
                  return 500;
            case 'M':
                  return 1000;
            default:
                  return 0;

            }
      }
}
