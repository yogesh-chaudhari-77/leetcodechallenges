class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """

        i = 0
        number = pow(2, i)
        print(number)

        while n >= number:
            if n == number:
                return True
            elif n < number:
                return False
            i += 1
            number = pow(2, i)
            print(number)

s = Solution()
print(s.isPowerOfTwo(217))
