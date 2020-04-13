class Solution(object):
    def flipAndInvertImage(self, A):
        for row in A:
            for i in xrange((len(row) + 1) / 2):
                """
                In Python, the shortcut row[~i] = row[-i-1] = row[len(row) - 1 - i]
                helps us find the i-th value of the row, counting from the right.
                """
                row[i], row[~i] = row[~i] ^ 1, row[i] ^ 1
        return A

s = Solution()
s.flipAndInvertImage([[1,1,0],[1,0,1],[0,0,0]])