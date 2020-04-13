class Solution(object):
    def isLongPressedName(self, name, typed):
        """
        :type name: str
        :type typed: str
        :rtype: bool
        """

        if name == typed:
            return True

        i = 0
        j = 0
        name = list(name)
        typed = list(typed)

        while i < len(name):
            current_char = name[i]
            if len(typed) == 0 :
                return False

            while j < len(typed):
                if current_char == typed[j]:
                    del name[i]
                    typed = typed[j+1:]
                    j = 0
                    #print(typed)
                    break;
                if j == len(typed) - 1:
                    return False
                j += 1

            i = 0

        return True


s = Solution()
print(s.isLongPressedName("saeed", typed = "ssaaedd"))
