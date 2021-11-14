package leetCode;

public class TrappingRainWater {

      public int trap(int[] height) {

            int n = height.length;
            int lo = 0;
            int hi = n - 1;

            if (n == 0) {
                  return 0;
            }
            int gL = height[lo];
            int gR = height[hi];

            int result = 0;
            while (lo < hi) {

                  int lL = height[lo];
                  int lR = height[hi];

                  int gLR = Math.min(gL, gR);
                  int lLR = Math.min(lL, lR);

                  result += gLR >= lLR ? gLR - lLR : 0;

                  gL = Math.max(lL, gL);
                  gR = Math.max(lR, gR);

                  if (lL >= lR) {
                        hi -= 1;
                  }

                  else {
                        lo += 1;
                  }
            }

            return result;
      }
}
