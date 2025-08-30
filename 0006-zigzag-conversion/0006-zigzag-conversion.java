class Solution {
    public String convert(String s, int numRows) {
        //create array of string of length numRows
        
        String[] zigzag = new String[numRows];

        //Initialize with ""

        for(int i = 0; i <  numRows; i++){
            zigzag[i] = "";
        }


        int i = 0;
        
        //add element of particular row to zigzag

        while(i < s.length()){
            for(int index = 0; index < numRows && i < s.length(); index++){
                zigzag[index] += s.charAt(i++);
            }

            for(int index = numRows - 2; index > 0 && i < s.length(); index--){
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