package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharNumberCount {

      public static void main(String[] args) {

            charValueCount("banana");

      }

      public static void charValueCount(String str) {

            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                  char c = str.charAt(i);

                  Integer value = map.get(c);

                  if (value != null) {
                        map.put(c, Integer.valueOf(value + 1));
                  } else {
                        map.put(c, 1);
                  }
            }
            // create a set from map in order to use sort on array
            Set<Entry<Character, Integer>> set = map.entrySet();
            // list is created from set to sort it with sort()
            List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
            // sort the list with new comparator based on our map data
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

                  // compare method implication
                  @Override
                  public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
                        // comparison based off of value which is Integer object in our case
                        return o2.getValue().compareTo(o1.getValue());
                  }
            });

            for (Entry<Character, Integer> entry : list) {
                  System.out.println("Occurence of " + entry.getKey() + ": " + entry.getValue());
            }
      }

}
