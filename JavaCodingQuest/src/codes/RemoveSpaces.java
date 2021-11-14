package codes;

public class RemoveSpaces {

      public static void main(String[] args) {

            String str = "Replace each sub-string with blank";
            System.out.println(removeByRemove(str));
            System.out.println(removeByArray(str));
      }

      public static String removeByRemove(String str) {

            String result = str.replaceAll("\\s", "");
            return result;
      }

      public static String removeByArray(String str) {

            char[] arr = str.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arr.length; i++) {
                  if ((arr[i] != ' ') && (arr[i] != '\t')) {
                        sb.append(arr[i]);
                  }
            }
            return sb.toString();

      }

}
