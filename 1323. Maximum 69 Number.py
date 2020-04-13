class Solution(object):
    def maximum69Number(self, num):
        """
        :type num: int
        :rtype: int
        """

        string = list(str(num))
        if string.__contains__('6'):
            firstIndexOf6 = string.index('6')
            string[firstIndexOf6] = '9'

        return int(''.join(string))


s = Solution()
print(s.maximum69Number(9969))
