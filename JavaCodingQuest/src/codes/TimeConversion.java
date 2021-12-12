package codes;

public class TimeConversion {

      public static void main(String[] args) {
            String str = "12:01:00AM";
            System.out.println(str.substring(0, 2));
            System.out.println(str.substring(8, 10));
            int time = Integer.parseInt(str.substring(0, 2));
            System.out.println(time + 2);
            System.out.println(str.substring(2, 8));
            System.out.println(timeConversion(str));
      }

      public static String timeConversion(String str) {

            String a = "AM";
            String b = "PM";
            String h = str.substring(0, 2);
            String t = str.substring(8, 10);

            StringBuilder sb = new StringBuilder();
            if (t.equals(b)) {
                  int time = Integer.valueOf(str.substring(0, 2));
                  if (time == 12) {
                        sb.append(h).append(str.substring(2, 8));
                  } else {
                        time += 12;
                        String tm = String.valueOf(time);
                        sb.append(tm).append(str.substring(2, 8));
                  }
                  return sb.toString();
            } else {
                  int time = Integer.valueOf(str.substring(0, 2));
                  if (time == 12) {
                        sb.append("00").append(str.substring(2, 8));
                        return sb.toString();
                  } else {
                        return str.substring(0, 8);
                  }

            }

      }
}
