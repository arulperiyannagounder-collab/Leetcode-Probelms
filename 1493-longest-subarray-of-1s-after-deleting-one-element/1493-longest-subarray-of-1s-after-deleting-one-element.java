class Solution {
    public int longestSubarray(int[] nums) {
        int maxlen = 0;
        int zeroCount = 0;
        int zpos = -1;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroCount++;
                if (zeroCount > 1) {
                    start = zpos + 1;
                }
                zpos = end;
            }
            maxlen = Math.max(maxlen, end - start);
        }
        return maxlen;
    }
}
