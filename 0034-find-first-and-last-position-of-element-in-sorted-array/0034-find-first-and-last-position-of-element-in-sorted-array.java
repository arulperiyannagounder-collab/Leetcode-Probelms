class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low =0;
        int high=nums.length-1;
        int arr[]={-1,-1};
        while ( low<=high){
            int mid =(low+high)/2;
            if (nums[mid]==target){
                arr[0]=mid;
                high=mid-1;
            }
            else if (nums[mid]>target){
                high=mid-1;

            }
            else if (nums[mid]<target){
                low=mid+1;
            }}
            low=0;
            high=nums.length-1;
             while (low<=high){
            int mi =(low+high)/2;
            if (nums[mi]==target){
                arr[1]=mi;
                low=mi+1;
            }
            else if (nums[mi]>target){
                high=mi-1;

            }
            else if (nums[mi]<target){
                low=mi+1;
            }
             
        }return arr;
    }
}