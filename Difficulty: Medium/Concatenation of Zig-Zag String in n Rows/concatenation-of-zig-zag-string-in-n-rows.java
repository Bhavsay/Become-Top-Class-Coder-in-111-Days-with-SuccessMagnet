// User function Template for Java
class Solution {
    String convert(String s, int n) {
        //create array of string of length numRows
        
        String[] zigzag = new String[n];

        //Initialize with ""

        for(int i = 0; i <  n; i++){
            zigzag[i] = "";
        }


        int i = 0;
        
        //add element of particular row to zigzag

        while(i < s.length()){
            for(int index = 0; index < n && i < s.length(); index++){
                zigzag[index] += s.charAt(i++);
            }

            for(int index = n - 2; index > 0 && i < s.length(); index--){
                zigzag[index] += s.charAt(i++);
            }
        }

        String output = "";
        for(String str : zigzag ){
            output+=str;
        }

        return output;
    }
}