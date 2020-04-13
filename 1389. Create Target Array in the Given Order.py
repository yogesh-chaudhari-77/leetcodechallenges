class Solution:
    def createTargetArray(self):
        nums = [1, 2, 3, 4, 0]
        index = [0, 1, 2, 3, 0]
        #result = [0] * (max(index) + 1)   # initialising list with the max index number to avoid index out of bounds error
        result = list()
        for i in range(len(nums)):
            result.insert(index[i], nums[i])

        return result

s = Solution()
print(s.createTargetArray())