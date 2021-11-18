import java.util.ArrayList;
import java.util.List;

public class MinMaxPrint {

      public static void main(String[] args) {

//            int[] array = {1, 2, 3, 4, 5};
            List<Integer> list = new ArrayList<Integer>();
            // populateArray(list, 5);
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);

            System.out.println(list);
            System.out.println(list.size());
            printMinMax(list);
      }

      public static void printMinMax(List<Integer> arr) {

            int minElement = 0, maxElement = 0, sum = 0;
            minElement = arr.get(0);
            maxElement = minElement;
            sum = minElement;

            for (int i = 1; i < arr.size(); i++) {
                  sum += arr.get(i);
                  if (arr.get(i) < minElement) {
                        minElement = arr.get(i);
                  }
                  if (arr.get(i) > maxElement) {
                        maxElement = arr.get(i);
                  }
            }
            System.out.println((sum - maxElement) + " " + (sum - minElement));
      }

      public static List<Integer> populateArray(List<Integer> list, int n) {

            for (int i = 0; i < n; i++) {
                  list.add(i + 1);
            }

            return list;
      }

}
