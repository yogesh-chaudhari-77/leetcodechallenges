class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """

        list_of_words = s.split(" ");
        print(list_of_words)
        for i in range (len(list_of_words)) :
            list_of_words[i] = list_of_words[i][::-1]

        return ' '.join(list_of_words)

s = Solution()
print(s.reverseWords("Let's take LeetCode contest"))