class Solution {
    private boolean binarySearch(List<Integer> arr, int need) {
        int low = 0, hi = arr.size() - 1;

        while(low <= hi) {
            int mid = low + (hi - low) / 2;
            if(arr.get(mid) == need)
                return true;
            else if(arr.get(mid) < need)
                low = mid + 1;
            else
                hi = mid - 1;
        }

        return false;
    }

    public boolean splitArraySameAverage(int[] nums) {
        int N = nums.length;
        int S = 0;
        for(int num : nums) S += num;
        int n1 = N/2;    
        int n2 = N - n1;  

        Map<Integer, List<Integer>> sumsLeft = new HashMap<>();
        for(int mask = 0; mask < (1 << n1); mask++) {
            int s = 0; //subset sum
            int count = 0;
            for(int i = 0; i < n1; i++) {
                if((mask & (1 << i)) != 0) {
                    s += nums[i];
                    count++;
                }
            }
            sumsLeft.computeIfAbsent(count, key -> new ArrayList<>()).add(s);
        }

        Map<Integer, List<Integer>> sumsRight = new HashMap<>();
        for(int mask = 0; mask < (1 << n2); mask++) {
            int s = 0; 
            int count = 0;
            for(int i = 0; i < n2; i++) {
                if((mask & (1 << i)) != 0) {
                    s += nums[n1+i];
                    count++;
                }
            }
            sumsRight.computeIfAbsent(count, key -> new ArrayList<>()).add(s);
        }


        for(int count = 0; count <= n2; count++) {
           
            Collections.sort(sumsRight.computeIfAbsent(count, key -> new ArrayList<>()));
        }

        for(int k = 0; k <= n1; k++) { 
            for(int leftSubSum : sumsLeft.getOrDefault(k, new ArrayList<>())) {
                
                for(int m = 0; m <= n2; m++) {
                    int size = k + m; 
                    if(size == 0 || size == N) continue; 

                    if(size * S % N != 0)
                        continue; 

                    int need = size * S / N - leftSubSum;

                    if(binarySearch(sumsRight.getOrDefault(m, new ArrayList<>()), need)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}