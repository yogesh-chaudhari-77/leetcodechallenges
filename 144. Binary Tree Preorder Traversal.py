class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        # recursive method

        ret = []

        def fn(node):
            if node:
                ret.append(node.val)
                fn(node.left)
                fn(node.right)

        fn(root)
        return ret

