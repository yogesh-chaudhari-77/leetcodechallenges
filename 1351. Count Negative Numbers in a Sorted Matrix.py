class Solution(object):
    def countNegatives(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        negative_count = 0;

        for inner_list in grid :
            for y in inner_list :
                if y < 0 :
                    negative_count += 1

        return negative_count



s = Solution()
print(s.countNegatives([[1,1]]))