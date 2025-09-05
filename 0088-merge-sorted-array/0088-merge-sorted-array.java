class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m; i<nums1.length; i++){
            if(nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}


// class Soluton {
//     public void mergeSort(int[] nums1, int m, int[] nums2, int n){
//         int i=m-1; // 3-1=0,1,2
//         int j=n-1;  // 3-1 =0,1,2
//         int k = m+n-1 // 6-1= 0,1,2,3,4,5

        
//     }
// }
/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;

            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        
    }
}

psvm in 
int nums1[] = {1,2,3,0,0,0};
int nums2[] = {2,3,5};
int m = 3;
int n = 3;
use static method or create object.
mergeArrays(nums1,nums2,m,n);
for(int i=0; i<m+n; i++){
    System.out.println(nums1[i]+" ");
}*/
