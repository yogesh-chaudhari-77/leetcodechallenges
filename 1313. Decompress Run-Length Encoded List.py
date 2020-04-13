class Solution:
    def decompressRLElist(self):
        # nums = [1,1,2,3]
        result = list()
        i = 0
        while i < len(nums) :
            result = result + [nums[i+1]] * nums[i]
            i = i + 2;

        return result

s = Solution()
print(s.decompressRLElist())