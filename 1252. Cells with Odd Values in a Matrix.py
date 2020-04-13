class Solution(object):
    arr = list()
    odd_counter = 0;

    def oddCells(self, n, m, indices):
        """
        :type n: int
        :type m: int
        :type indices: List[List[int]]
        :rtype: int
        """

        for i in range(n):
            self.arr.append([0] * m)

        for k in range(len(indices)):
            row_val = indices[k][0]
            col_val = indices[k][1]

            for i in range(n):
                self.arr[i][col_val] = self.arr[i][col_val] + 1

            for i in range(m):
                self.arr[row_val][i] = self.arr[row_val][i] + 1

        for a in range(n):
            for b in range(m):
                if self.arr[a][b] % 2 == 1:
                    self.odd_counter += 1
        print(self.arr)
        return self.odd_counter

s = Solution()
print(s.oddCells(2, 2, [[1,1],[0,0]]))
