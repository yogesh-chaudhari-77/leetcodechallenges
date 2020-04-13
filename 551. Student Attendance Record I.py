class Solution(object):
    def checkRecord(self, s):
        """
        :type s: str
        :rtype: bool
        """

        s = list(s)

        moreThan2ConsecutiveL = False;
        moreThan1A = False
        numberOfA = s.count("A")


        if numberOfA <= 1 :
            moreThan1A = False;
        else:
            moreThan1A = True

        for i in range(len(s) - 2):
            if s[i] == 'L' and s[i+1] == 'L' and s[i+2] == 'L' :
                moreThan2ConsecutiveL = True
                break;

        if moreThan2ConsecutiveL == False and moreThan1A == False :
            return True
        else :
            return False

s = Solution()
print(s.checkRecord("PPALLP"))