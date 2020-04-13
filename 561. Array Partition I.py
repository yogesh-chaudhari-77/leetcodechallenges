class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        max_sum = 0;
        arr_len = len(nums)
        i = 0
        while i < (arr_len - 1):
            print(i)
            max_sum = max_sum + min(nums[i], nums[i+1])
            i += 2
        return max_sum

s = Solution()
print(s.arrayPairSum([1,4,3,2]))