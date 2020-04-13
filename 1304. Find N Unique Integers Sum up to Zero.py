class Solution(object):
    def sumZero(self, n):
        """
        :type n: int
        :rtype: List[int]
        """

        result = list();

        if n == 0 :
            return result
        elif n == 1 :
            result.append(0)
            return result

        for i in range(n-1) :
            result.append(i)

        result.append(sum(result) * -1)
        return result

s = Solution()
print(s.sumZero(1000))

print(sum([24,2,2,-39,-45,23,38,7,20,-32]))