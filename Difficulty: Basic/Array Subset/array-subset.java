class Solution {
    public boolean isSubset(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element in a
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if b can be formed from a
        for (int num : b) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false; // missing element or not enough occurrences
            }
            map.put(num, map.get(num) - 1); // use one occurrence
        }

        return true;
    }
}