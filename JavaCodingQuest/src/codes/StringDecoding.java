package codes;

public class StringDecoding {

      private static char[] reg = { 'a', 'b', 'c', 'd', 'e', 'f' };
      private static char[] far = { 'b', 'c', 'd', 'e', 'f', 'g' };

      public static void main(String[] args) {

            System.out.println(stringDecoding("abcdef"));

      }

      public static String stringDecoding(String str) {

            StringBuilder sb = new StringBuilder(str).reverse();
            StringBuilder rv = new StringBuilder();

            for (int i = 0; i < sb.length(); i++) {
                  int index = getIndex(sb.charAt(i));
                  rv.append(far[index]);
            }
            return rv.toString();
      }

      private static int getIndex(Character ch) {

            for (int i = 0; i < reg.length; i++) {
                  if (reg[i] == ch) {
                        return i;
                  }
            }
            return 0;
      }
}
