
package leetCode;

public class RomanToInt {

      public RomanToInt() {

      }

      public int romanToInt(String s) {
            return romanToInt(s, 0, s.length() - 1);
      }

      public int romanToInt(String s, int prev, int index) {
            if (index < 0)
                  return 0;

            int result = getCharValue(s.charAt(index));

            if (prev > result)
                  return romanToInt(s, result, index - 1) - result;
            else
                  return result + romanToInt(s, result, index - 1);
      }

      private int getCharValue(char c) {
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
