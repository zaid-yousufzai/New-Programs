/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//remove duplicate from an array
//unsorted

package arrayPrograms;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Hp
 */

public class Program05 {
    
    
    static void duplicate(int arr[]) {
              // HashMap<Integer, Integer> mp = new HashMap<>();

              // for (int i = 0; i < arr.length; i++) {
              //        if (!mp.containsKey(arr[i])) {
              //               System.out.print(arr[i] + " ");
              //               mp.put(arr[i], 1);
              //        }
              // }


               HashSet<Integer> mp = new HashSet<>();

              for (int i = 0; i < arr.length; i++) {
                     mp.add(arr[i]);
              }


              for(int i:mp)
              {
                     System.out.print(i+" ");
              }
       }

       public static void main(String[] args) {
             
              int arr[] = { 4, 3,3,3,3,3, 9, 2, 4, 1, 10, 89, 34 };

              duplicate(arr);
}
}
