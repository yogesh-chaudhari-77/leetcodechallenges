class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        numsLen = len(nums)
        i = 0
        next_pointer = 0
        #print(nums)
        while i < numsLen:
            numbers_of_occurrences = nums.count(nums[i])
            nums[next_pointer] = nums[i]

            i = i + numbers_of_occurrences
            next_pointer += 1

        #print(nums)
        return next_pointer;


s = Solution()
print(s.removeDuplicates([1,1,2]))
