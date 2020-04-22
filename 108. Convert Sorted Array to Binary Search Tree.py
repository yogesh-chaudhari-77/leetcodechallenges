"""
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary
tree in which the depth of the two subtrees of every node never differ by more than 1.
"""


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        numsLen = len(nums)
        if numsLen == 0 :
            return None

        mid = numsLen // 2
        rootNode = TreeNode(nums[mid])

        leftHalf = nums[0:mid]
        rightHalf = nums[mid+1:]

        while len(leftHalf) :
            mid = len(leftHalf) // 2
            element = leftHalf[mid]
            del leftHalf[mid]
            self.appendTreeNode(rootNode, element)

        while len(rightHalf):
            mid = len(rightHalf) // 2
            element = rightHalf[mid]
            del rightHalf[mid]
            self.appendTreeNode(rootNode, element)

        return rootNode


    def appendTreeNode(self, node, element):
        if node.val > element:
            if node.left is None:
                node.left = TreeNode(element)
            else:
                self.appendTreeNode(node.left, element)
        elif node.val < element:
            if node.right is None:
                node.right = TreeNode(element)
            else:
                self.appendTreeNode(node.right, element)