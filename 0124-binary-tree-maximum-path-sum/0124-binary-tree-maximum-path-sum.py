# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        max_sum = float('-inf')
        
        def dfs(node):
            nonlocal max_sum
            if not node:
                return 0
            
            # Ignore negative paths by taking max with 0
            left = max(0, dfs(node.left))
            right = max(0, dfs(node.right))
            
            # Update the global maximum path sum passing through this node
            max_sum = max(max_sum, node.val + left + right)
            
            # Return the max sum extending upwards to the parent (only one branch)
            return node.val + max(left, right)
            
        dfs(root)
        return max_sum
