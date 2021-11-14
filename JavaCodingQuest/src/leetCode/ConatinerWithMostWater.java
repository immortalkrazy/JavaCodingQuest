package leetCode;

public class ConatinerWithMostWater {

      public int maxArea(int[] height) {

            int maxArea = 0;

            for (int i = 0; i < height.length; i++) {

                  int a = height[i];

                  for (int j = i + 1; j < height.length; j++) {

                        int b = Math.min(a, height[j]);
                        int area = (j - i) * b;

                        maxArea = Math.max(maxArea, area);
                  }
            }

            return maxArea;
      }
}
