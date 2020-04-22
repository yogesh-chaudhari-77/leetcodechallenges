# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    rangeSum = 0
    
    def __init__(self):
        self.rangeSum = 0
    
    def rangeSumBST(self, root, L, R):
        """
        :type root: TreeNode
        :type L: int
        :type R: int
        :rtype: int
        """
        """
            Inorder traversal of BST gives us the the sorted list in                   increasing order 
        """
        
        def fn(node) :
            if node is not None :
                fn(node.left)
                if L <= node.val <= R :
                    self.rangeSum += node.val
                fn(node.right)

        fn(root)
        return self.rangeSum
        