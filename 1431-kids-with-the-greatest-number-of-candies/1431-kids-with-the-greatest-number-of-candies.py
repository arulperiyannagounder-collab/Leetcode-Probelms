class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        
        out=[]
        for i in candies:
            out.append(i+ extraCandies>=max(candies))
        return out
        