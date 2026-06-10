class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String word : strs){ // "eat"
            char[] chars = word.toCharArray();         // ['e', 'a', 't']
            Arrays.sort(chars);                        //['a', 'e', 't']
            String sortedWord = new String(chars);     // aet

            if(!map.containsKey(sortedWord)){ 
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());

    }
}