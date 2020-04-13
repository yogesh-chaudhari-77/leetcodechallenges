class Solution(object):
    def luckyNumbers(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """

        min_in_rows = list()
        max_in_cols = [0] * len(matrix[0])
        lucky_numbers = list()

        print(max_in_cols)
        for i in range(len(matrix)):
            # finding minimum from row
            min_in_rows.append(min(matrix[i]))

            for j in range(len(matrix[i])):
                max_in_cols[j] = max(list([max_in_cols[j], matrix[i][j]]))  #

        i += 1

        print(min_in_rows)
        print(max_in_cols)

        for i in range(len(min_in_rows)):
            for j in range(len(max_in_cols)):
                if min_in_rows[i] == max_in_cols[j]:
                    lucky_numbers.append(min_in_rows[i])

        return lucky_numbers


s = Solution()
print(s.luckyNumbers([[7,8],[1,2]]))
