class Solution(object):
    def reverseOnlyLetters(self, s):
        """
        :type S: str
        :rtype: str
        """
        if len(s) == 0:
            return ''
        elif len(s) == 1:
            return s

        i = 0;
        j = len(s) - 1
        s = list(s)
        temp = ''
        left_char = False
        right_char = False

        while i < j:
            if (ord(s[i]) >= 65 and ord(s[i]) <= 90) or (ord(s[i]) >= 97 and ord(s[i]) <= 122):
                left_char = True
            else:
                i += 1

            if (ord(s[j]) >= 65 and ord(s[j]) <= 90) or (ord(s[j]) >= 97 and ord(s[j]) <= 122) :
                right_char = True
            else:
                j -= 1

            if left_char and right_char:
                temp = s[i]
                s[i] = s[j]
                s[j] = temp
                i += 1
                j -= 1
                left_char = right_char = False

        return ''.join(s)


s = Solution()
print(s.reverseOnlyLetters("a-bC-dEf-ghIj"))
