"""
Given a Binary Search Tree (BST) with the root node root,
return the minimum difference between the values of any two different nodes in the tree.
"""


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    def minDiffInBST(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        sortedList = []

        def getSortedList(node):
            if node is not None:
                getSortedList(node.left)
                sortedList.append(node.val)
                getSortedList(node.right)

        getSortedList(root)
        minDifference = sortedList[len(sortedList) - 1]     # Initialise with highest possible value in the list

        for i in range (len(sortedList) - 1) :
            if (sortedList[i+1] - sortedList[i]) < minDifference :
                minDifference = sortedList[i+1] - sortedList[i]

        print(minDifference)
        print(sortedList)
        return minDifference