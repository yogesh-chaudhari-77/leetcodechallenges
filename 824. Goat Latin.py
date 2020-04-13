class Solution(object):
    def toGoatLatin(self, S):
        """
        :type S: str
        :rtype: str
        """

        list_of_words = S.split(" ")
        for i in range(len(list_of_words)):
            list_of_letters = list(list_of_words[i])
            if list_of_letters[0] == 'a' or list_of_letters[0] == 'e' or list_of_letters[0] == 'i' or list_of_letters[
                0] == 'o' or list_of_letters[0] == 'u' or list_of_letters[0] == 'A' or list_of_letters[0] == 'E' or \
                    list_of_letters[0] == 'I' or list_of_letters[0] == 'O' or list_of_letters[0] == 'U':
                list_of_letters.append("ma")
            else:
                list_of_letters.append(list_of_letters[0])
                del list_of_letters[0]
                list_of_letters.append("ma")

            list_of_letters = list_of_letters + ['a'] * (i+1)
            list_of_words[i] = ''.join(list_of_letters)

        return " ".join(list_of_words)


s = Solution()
print(s.toGoatLatin("I speak Goat Latin"))
# "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"