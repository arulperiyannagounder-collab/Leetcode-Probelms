class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l=len(nums)
        a=nums
        for i in range(l):
            for j in range(l):
                
                if i!=j:
                    

                    if a[i]+a[j]==target:
                        return[i,j]


        