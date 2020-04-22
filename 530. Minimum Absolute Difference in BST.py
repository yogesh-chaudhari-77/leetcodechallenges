"""
Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def getMinimumDifference(self, root):
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