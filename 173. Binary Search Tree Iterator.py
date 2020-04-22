"""
Share
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

"""


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class BSTIterator(object):
    currentPointer = 0;
    sortedList = []

    def __init__(self, root):
        """
        :type root: TreeNode
        """
        self.sortedList = []

        def fn(node):
            if node is not None:
                fn(node.left)
                self.sortedList.append(node.val)
                fn(node.right)

        fn(root)

    def next(self):
        """
        @return the next smallest number
        :rtype: int
        """
        if self.hasNext() :
            self.currentPointer += 1;
            return self.sortedList[self.currentPointer - 1]
        else :
            return False


    def hasNext(self):
        """
        @return whether we have a next smallest number
        :rtype: bool
        """

        if len(self.sortedList) > 0:
            if len(self.sortedList[self.currentPointer:]) > 0:
                return True
            else:
                return False
        else:
            return False

# Your BSTIterator object will be instantiated and called as such:
# obj = BSTIterator(root)
# param_1 = obj.next()
# param_2 = obj.hasNext()
