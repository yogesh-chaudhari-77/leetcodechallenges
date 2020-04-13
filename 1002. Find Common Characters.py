class Solution(object):
    def commonChars(self, A):
        """
        :type A: List[str]
        :rtype: List[str]
        """

        str = list(A[0])
        charLen = 0
        i = 1
        final_list = list()

        while charLen < len(str):

            list.append(str[charLen])

            while i < (len(A)):
                if A[i].count(str[i]) <= 1 :
                    list.remove(str[charLen])
                    break;



    def deleteCharFromEach(self, A):

        for i in range(len(A)):
            print(i)


s = Solution()
s.commonChars(["cool","lockyu","cookuy"])