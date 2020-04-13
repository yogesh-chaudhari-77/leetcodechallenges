class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        occurrence_count = nums.count(0)  # get the total number of occurrence of 0
        i = 0
        for i in range(occurrence_count):
            nums.remove(0)

        for i in range(occurrence_count):
            nums.append(0)

        print(nums)


s = Solution()
s.moveZeroes([0,1,0,3,12])
