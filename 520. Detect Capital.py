class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        word = list(word)
        case = list()
        valid_case_1 = ''.join(['u'] * len(word))
        valid_case_2 = ''.join(['l'] * len(word))
        valid_case_3 = ''.join(['u'] + ['l'] * (len(word) - 1))

        for i in range(len(word)) :
            if ord(word[i]) >= 65 and ord(word[i]) <= 90 :
                case.append("u")
            else:
                case.append("l")

        if ''.join(case) == valid_case_1 or ''.join(case) == valid_case_2 or ''.join(case) == valid_case_3 :
            return True
        else :
            return False


s = Solution()
print(s.detectCapitalUse("leet"))