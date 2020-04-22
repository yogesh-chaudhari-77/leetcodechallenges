"""
Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
"""


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """

        if root is None :
            return None

        sortedList = []

        def fn(node):
            if node is not None :
                fn(node.left)
                sortedList.append(node.val)
                fn(node.right)

        fn(root)
        return sortedList[k-1]

