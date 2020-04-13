class Solution:
    def findNumbers(self, nums) -> int:
        count = 0;
        for x in nums :
            number_str = x.__str__()
            if len(number_str) % 2 == 0 :
                count = count + 1

        return count

s = Solution()
s.findNumbers(list((12,345,2,6,7896)))