# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        sortedList = []

        def fn(node):
            if node is not None:
                fn(node.left)
                sortedList.append(node.val)
                fn(node.right)

        fn(root)
        print(sortedList)
        return sortedList
