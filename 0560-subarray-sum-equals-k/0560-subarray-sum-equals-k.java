public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        
      
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum == k) count++;
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

/*
class Solution {
    public int subarraySum(int[] arr, int k){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0]=arr[0];
        for(int i=1; i<n; i++){
            pref[i]=pref[i-1]+arr[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count =-0;
        for(int i=0; i<n; i++){
            if(map.containsKey(pref[i]-k)){
                count+=map.get(pref[i]-k);
            }
            map.put(pref[i],map.getOrDefault(pref[i],0)+1);
        }
        return count;
    }
}

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             int sum = 0; // reset sum for each starting index
//             for (int j = i; j < n; j++) {
//                 sum += nums[j];
//                 if (sum == k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }


Qfind the number of subarrays whose sum == k 
subarray :- It is contineous portion or part of array
brute force approach 
Optimize :- o(n)

HashMap<Integer, Integer> map = new HashMap<>();
map.put(0,1)
int count =0;
for(int i=0; i<n; i++){
    if(map.containsKey(pref[i]-k)){
        count+=map.get(pref[i]-k);
    } 
    map.put(pref[i],map.geOrDefault(pref[i],0)+1);
    } 
    return count;
}*/
