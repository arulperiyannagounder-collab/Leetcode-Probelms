// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int start=0;
//         int end =0;
//         int minLen= Integer.MAX_VALUE;
//         int window =nums[0];
//         // while(end< nums.length-1){
//         //     if (window < target) {
//         //     end++;
//         //     window+= nums[end];}
//             while (window >= target){
//                 minLen=Math.min(minLen,end-start+1);
//                window-=nums[start];
//                start++; 
              
//             }
//         }return minLen ==Integer.MAX_VALUE ? 0:minLen;
//     }
// }



class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int windowSum = 0;

        // Cleanly expand the window boundary
        for (int end = 0; end < nums.length; end++) {
            windowSum += nums[end];

            // Contract the window as long as the target is met
            while (windowSum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                windowSum -= nums[start];
                start++;
            }
        }

        // Return 0 if no valid subarray was found
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}