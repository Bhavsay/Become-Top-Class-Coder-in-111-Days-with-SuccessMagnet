// User function Template for Java

class Solution {
    static int isDisarium(int N) {
        int temp = N;
        int digit=0;
        while(temp>0){
            temp = temp/10;
            digit++;
        }
        temp = N;
        int sum = 0;
        int rem = 0;
        while(temp>0){
            for(int i=digit; i>=1; i--){
                rem = temp%10;
                sum = sum+(int)Math.pow(rem,i);
                temp = temp/10;
            }
        }
        if(sum==N){
            return 1;
        }
        else {
            return 0;
        } 
        
    }
};