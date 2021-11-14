package codes;

public class TrapRainWater {

      public static void main(String[] args) {

            int[] arr1 = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
            System.out.println("Water:   " + trapWater(arr1));

            int[] arr2 = { 4, 2, 0, 3, 2, 5 };
            System.out.println("Water:   " + trapWater(arr2));
      }

      public static int trapWater(int[] arr) {

            int sum = 0;
            int left = 0;
            int right = arr.length - 1;
            int max = 0;

            while (left <= right) {

                  if (arr[left] <= arr[right]) {

                        sum = sum + (Math.max(0, max - arr[left]));
                        max = Math.max(max, arr[left]);
                        left++;

                  } else {

                        sum = sum + (Math.max(0, max - arr[right]));
                        max = Math.max(max, arr[right]);
                        right--;
                  }
            }
            return sum;
      }

}
