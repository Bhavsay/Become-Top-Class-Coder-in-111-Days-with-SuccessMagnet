// class Solution {
//     int minDist(int arr[], int x, int y) {
//         int minDist = Integer.MAX_VALUE;
//         int prev = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x || arr[i] == y) {
//                 if (prev != -1 && arr[i] != arr[prev]) {
//                     minDist = Math.min(minDist, i - prev);
//                 }
//                 prev = i;
//             }
//         }
//         return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
//     }
// }
import java.util.*;

class Solution {
    public int minDist(int[] arr, int x, int y) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>(); // stores last index of x or y
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (map.containsKey(arr[i] == x ? y : x)) { 
                    int lastIndex = map.get(arr[i] == x ? y : x);
                    min = Math.min(min, i - lastIndex);
                }
                map.put(arr[i], i); // update last index of current number
            }
        }
        
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}