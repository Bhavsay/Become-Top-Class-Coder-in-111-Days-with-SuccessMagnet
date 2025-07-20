class Solution {
    public void reverseArray(int arr[]) {
        // This code TM  2o(n);
        int i=0;
        int j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
/* code here
    ReverseArray it will take Time complexity :2o(n); 
        space complecity o(n);  extra n size array
        
        can i again optimize this code. --ans ----yes --- use only array..
        
        int b[] = new int[arr.length];
        
        int i = arr.length-1, j=0;
        while(j<b.length){
            b[j] = arr[i];
            
            j++;
            i--;
        }
        for(i=0; i<b.length; i++){
            arr[i]=b[i];
        }
------------------------------------------------------------------------------------
        // This code TM  2o(n);
        int i=0;
        int j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        space complexity: no exstra space o(1)'
        Time complexity: o(n)--actually array will take TC is (n/2);
        
        we will talk about time Complexity
        Time complexity depends on :- 
        -Internet connection(Strong, faster)
        -system resources(Ram, ssd, processor)
        -Temperature (laptop , outside, room)  temp high---slow execute.
*/