class Solution(object):
    def stringMatching(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """

        final_list = list()
        for i in range(len(words)):
            current_str = words[i]
            for j in range(len(words)):
                if current_str != words[j] and (current_str in words[j]):
                    final_list.append(current_str)
                    break

        return final_list

s = Solution()
s.stringMatching(["blue","green","bu"])