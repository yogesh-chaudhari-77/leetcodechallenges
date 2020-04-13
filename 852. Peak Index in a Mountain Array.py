class Solution(object):
    def peakIndexInMountainArray(self, A):
        """
        :type A: List[int]
        :rtype: int
        """

        i = 1
        while i < len(A) - 1 :
            print(i)
            if A[i-1] < A[i] > A[i+1]:
                return i
            i += 1

s = Solution()
print(s.peakIndexInMountainArray([0,0,1,2,4,1,0]))