package codes;

public class StringReplace {

      public static void main(String[] args) {
            System.out.println(addKbeforeFs("fluffy"));
            // TODO Auto-generated method stub

      }

      public static String addKbeforeFs(String str) {
            String resultString = str.replaceAll("f", "Kf");
            String outPutString = resultString.replaceAll("F", "KF");
            return outPutString;
      }

}
