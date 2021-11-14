package codes;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinusRatios {
      public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt).collect(toList());

            plusMinus(arr);

            bufferedReader.close();
      }

      public static void plusMinus(List<Integer> arr) {
            // Write your code here
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            for (Integer i : arr) {
                  if (i > 0) {
                        positiveCount = positiveCount + 1;
                  }
                  if (i < 0) {
                        negativeCount = negativeCount + 1;
                  }
                  if (i == 0) {
                        zeroCount = zeroCount + 1;
                  }
            }

            double positiveRatio = (double) positiveCount / arr.size();
            double negativeRatio = (double) negativeCount / arr.size();
            double zeroRatio = (double) zeroCount / arr.size();

            System.out.println(formatOutput(positiveRatio));
            System.out.println(formatOutput(negativeRatio));
            System.out.println(formatOutput(zeroRatio));
      }

      private static String formatOutput(Double ratio) {

            BigDecimal value = BigDecimal.valueOf(ratio);
            String pattern = "#0.000000"; // If you like 6 zeros
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(value);

            return output;
      }

}
