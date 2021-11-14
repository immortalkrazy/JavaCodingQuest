package codes;

public class Panagram {

      public static void main(String[] args) {

            String str1 = "The quick brown fox jumps over a lazy dog";
            System.out.println("String is Paragram:   " + isPanagram(str1));
      }

      public static boolean isPanagram(String s) {

            String str = s.toLowerCase();

            if (str.length() < 26) {
                  return false;

            } else {

                  for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (str.indexOf(ch) < 0) {
                              return false;
                        }
                  }
            }
            return true;
      }

}
