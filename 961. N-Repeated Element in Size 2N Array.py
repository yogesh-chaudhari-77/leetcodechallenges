class Solution(object):
    def repeatedNTimes(self, A):
        """
        :type A: List[int]
        :rtype: int
        """

        A.sort()

        for i in range(len(A)):
            if A[i] == A[i+1]:
                return A[i]

s = Solution()
print(s.repeatedNTimes([5,1,5,2,5,3,5,4]))