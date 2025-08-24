// class Solution {
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {
//         ArrayList<Integer> numbers = new ArrayList<>();
//         int i=0,j=0;
//         int m = a.length;
//         int n = b.length;
//         while(i<m && j<n){
//             while(i+1<m && a[i+1]==a[i]){
//                 i+=1;
//             }
//             while(j+1<n && b[j+1]==b[j]){
//                 j+=1;
//             }
//             else if(a[i]<b[j]){
//                 numbers.add(a[i]);
//                 i++;
//             }
//             else if(a[i]>b[j]){
//                 numbers.add(b[j]);
//                 j++;
//             }
//             else {
//                 numbers.add(a[i]);
//                 j+=1;
//                 i+=1;
//             }
//         }
//         while(i<m){
//             while(i+1<m && a[i+1]==a[i]){
//                 i+=1;
//             numbers.add(a[i]);
//             i+=1
//             }
//         }
//         while(j<n){
//             while(j+1<m && a[j+1]==a[j]){
//                 i+=1;
//             numbers.add(a[j]);
//             j+=1
//             }
//         }
        
//         return numbers;
//     }
// }
import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0, j = 0;
        int m = a.length;
        int n = b.length;

        while (i < m && j < n) {
            while (i + 1 < m && a[i + 1] == a[i]) i++;
            while (j + 1 < n && b[j + 1] == b[j]) j++;

            if (a[i] < b[j]) {
                numbers.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                numbers.add(b[j]);
                j++;
            } else {
                numbers.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < m) {
            while (i + 1 < m && a[i + 1] == a[i]) i++;
            numbers.add(a[i]);
            i++;
        }

        while (j < n) {
            while (j + 1 < n && b[j + 1] == b[j]) j++;
            numbers.add(b[j]);
            j++;
        }

        return numbers;
    }
}

