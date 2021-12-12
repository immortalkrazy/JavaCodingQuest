package codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueElement {

      public static void main(String[] args) {

            List<Integer> list = new ArrayList<Integer>();
            try (Scanner sc = new Scanner(System.in)) {
                  System.out.println("please numbers");
                  for (int i = 0; i < 5; i++) {
                        list.add(sc.nextInt());
                  }
            }
            System.out.println(list.size());
            System.out.println("Unique element is: " + uniqueElement(list));

      }

      public static int uniqueElement(List<Integer> list) {

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < list.size(); i++) {
                  if (!set.add(list.get(i))) {
                        set.remove(list.get(i));
                  }
            }
            List<Integer> lst = new ArrayList<>(set);
            return lst.get(0);
      }

}
