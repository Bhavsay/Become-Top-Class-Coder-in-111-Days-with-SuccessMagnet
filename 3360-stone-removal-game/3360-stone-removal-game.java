class Solution {
    public boolean canAliceWin(int n) {
      int limit = 10;
        int step = 10;
        boolean result = false;

        while (step >= 4 && n >= limit) {
            step--;
            limit += step;
            result = !result;
        }
        return result;
    }
}