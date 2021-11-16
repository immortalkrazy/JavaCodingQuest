package codes;

public class ReverseArrayElements {

      public static void main(String[] args) {

            int[] arr = { 10, 20, 30, 40, 50 };
            printArray(arr);

            printArray(reverseArray(arr));
      }

      public static int[] reverseArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
            }
            return arr;
      }

      private static void printArray(int[] arr) {

            System.out.print("Array elements are: array [ ");
            for (int i : arr) {
                  System.out.print(i + " ");
            }
            System.out.println("]");
      }

}
