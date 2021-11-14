package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

      public static void main(String[] args) {

            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
            minmaxSum(numbers);
      }

      public static void minmaxSum(List<Integer> list) {
            int[] array = new int[list.size()];
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                  sum = sum + list.get(i);
            }
            for (int i = 0; i < list.size(); i++) {
                  array[i] = sum - list.get(i);
            }
            Arrays.sort(array);
            System.out.println(array[0] + " " + array[list.size() - 1]);
      }

}
