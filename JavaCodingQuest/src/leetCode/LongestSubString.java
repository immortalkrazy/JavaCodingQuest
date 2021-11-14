package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

      public static void main(String[] args) {

            int result = lengthOfSubString("Hello");
            System.out.println(result);
      }

      public static int lengthOfSubString(String str) {

            Set<Character> charSet = new HashSet<>();

            char[] ch = str.toCharArray();

            for (int i = 0; i < ch.length; i++) {
                  // System.out.println(Character.valueOf(ch[i]));
                  charSet.add(Character.valueOf(ch[i]));
            }

            return charSet.size();
      }

}
