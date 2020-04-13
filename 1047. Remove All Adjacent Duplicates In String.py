class Solution(object):
    def removeDuplicates(self, S):
        """
        :type S: str
        :rtype: str
        """
        str_list = list(S)
        repeated = True

        i = 0
        while i < (len(str_list) - 1):
            print(str_list[i]+""+str_list[i + 1])
            if str_list[i] == str_list[i + 1]:
                del str_list[i]
                del str_list[i]
                if i > 0 :
                    i = i - 1
                continue

            i += 1

        return ''.join(str_list)


s = Solution()
print(s.removeDuplicates("abbaca"))
