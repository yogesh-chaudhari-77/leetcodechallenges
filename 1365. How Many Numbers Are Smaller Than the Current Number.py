class Solution:
    def smallerNumbersThanCurrent(self) :
        nums = [8,1,2,2,3]
        result = [0] * len(nums)                # Create a list

        for i in range(len(nums)) :
            x = nums[i]

            for y in nums :
                if y < x  :
                    result[i] += 1

        print(result)

s = Solution()
s.smallerNumbersThanCurrent()