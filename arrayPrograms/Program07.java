package arrayPrograms;
// find the non repeating elements form an array
import java.util.HashMap;
import java.util.HashSet;

public class Program07 {

    static void repeating(int a[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> repeatingElements = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
              repeatingElements.remove(a[i]);  //to remove the repeating elements we have to comment this line
                
            } else {
                map.put(a[i], 1);
                repeatingElements.add(a[i]);
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
