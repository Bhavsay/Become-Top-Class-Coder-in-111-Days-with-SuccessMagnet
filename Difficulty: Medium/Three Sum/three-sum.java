class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> set = new ArrayList<>();
        
        for(int i=0; i<arr.length-2; i++){
            
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }

            int left = i+1;
            int right = arr.length-1;

            while(left<right){

                int ourtarget = arr[i]+arr[left]+arr[right];

                if(ourtarget == 0){
                    set.add(new ArrayList<>(
                        Arrays.asList(arr[i],arr[left],arr[right])
                    ));
                    left++;
                    right--;
                    
                    while(left<right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while(left<right && arr[right] == arr[right+1]){
                        right--;
                    }
                }
                else if(ourtarget<0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
