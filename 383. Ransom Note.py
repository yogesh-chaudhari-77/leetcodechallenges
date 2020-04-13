class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """

        magazine_list = list(magazine)
        ransom_note_list = list(ransomNote)

        for i in range(len(ransom_note_list)):
            containsChar = magazine_list.__contains__ (ransom_note_list[i])
            if containsChar == True:
                magazine_list.remove(ransom_note_list[i])
            else:
                return False

        return True

s = Solution()
print(s.canConstruct("aaa", "abbb"))