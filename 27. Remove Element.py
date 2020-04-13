class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """

        occurance_count =  nums.count(val)
        i = 0
        for i in range (occurance_count) :
            nums.remove(val)

        return len(nums)

s = Solution()
s.removeElement([3,2,2,3], 3)