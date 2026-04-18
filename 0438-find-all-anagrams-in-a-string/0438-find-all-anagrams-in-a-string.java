class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();

        int[] pfre = new int[26];
        int[] sfre = new int[26];

        for(char ch : p.toCharArray()){
            pfre[ch-'a']++;
        }

        int left = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            sfre[ch-'a']++;  

            while(i-left+1>p.length()){
                sfre[s.charAt(left)-'a']--;
                left++;
            } 
            if(Arrays.equals(pfre, sfre)) result.add(left);
        }
        return result;
    }
}