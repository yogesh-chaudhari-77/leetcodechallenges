class Solution(object):
    def duplicateZeros(self, arr):
        """
        :type arr: List[int]
        :rtype: None Do not return anything, modify arr in-place instead.
        """
        original_len = len(arr)
        i = 0
        while i < original_len:
            if arr[i] == 0:
                arr.insert(i, 0)
                i = i + 2;
                continue
            i += 1;

        new_len = len(arr)
        excess_elements = new_len - original_len

        while excess_elements > 0 :
            del arr[original_len]
            excess_elements -= 1

        print(arr)

s = Solution()
s.duplicateZeros([1,2,3])