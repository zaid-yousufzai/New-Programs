

//find all repeating elements in an array

package arrayPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class Program06 {

    static void repeating(int a[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> repeatingElements = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
                repeatingElements.add(a[i]);
            } else {
                map.put(a[i], 1);
            }
        }

        System.out.print("Repeating elements: ");
        for (int element : repeatingElements) {
            System.out.print(element + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 6, 5, 4, 3, 5, 5, 5, 5, 8, 9};
        repeating(a);
    }
}
