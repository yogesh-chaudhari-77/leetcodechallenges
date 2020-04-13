class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """

        arr.sort()
        lucky_integers = list([-1])

        i = 0
        while i < len(arr):
            count_of_number = arr.count(arr[i])
            if arr[i] == count_of_number:
                lucky_integers.append(arr[i])
                i += count_of_number
            else:
                i = i + count_of_number

        return max(lucky_integers)


s = Solution()
print(s.findLucky([19, 12, 11, 14, 18, 8, 6, 6, 13, 9, 8, 3, 10, 10, 1, 10, 5, 12, 13, 13, 9]))
