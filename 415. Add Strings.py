class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """

        num1 = list(num1)
        num2 = list(num2)

        parsed_number_1 = self.getNumberFromStr(num1)
        parsed_number_2 = self.getNumberFromStr(num2)
        return str(parsed_number_1 + parsed_number_2)

    def getNumberFromStr(self, num1) :
        parsed_number_1 = 0
        num1_len = len(num1)
        for i in range(num1_len):
            number = ord(num1[i]) - 48
            #print((number * (10 ** (num1_len - i - 1))))
            parsed_number_1 = parsed_number_1 + (number * (10 ** (num1_len - i - 1)))

        return parsed_number_1

s = Solution()
print(s.addStrings("100", "100"))
