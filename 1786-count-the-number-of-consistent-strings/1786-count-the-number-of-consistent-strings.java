class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String w : words)
            if (w.chars().allMatch(c -> allowed.indexOf(c) != -1))
                count++;
        return count;
    }
}
