class Solution:
    def sortString(self, s: str) -> str:
        result = list()
        input_list = list(s)  # Having the input list sorted
        print(input_list)
        # Initializing the result list

        if len(input_list) > 0:

            char = min(input_list)
            result.append(char)
            input_list.remove(char)
            operation_flag = "ASC"
            minRequired = "N"
            maxRequired = "N"

            while len(input_list) > 0:
                if operation_flag == "ASC":
                    if minRequired == "Y":
                        char = min(input_list)
                        minRequired = "N"
                    else :
                        char = self.getNextLargeElement(result[len(result) - 1], input_list)
                        print("A -- "+char)
                        if char == "*":
                            operation_flag = "DESC"
                            maxRequired = "Y"

                if operation_flag == "DESC":
                    if maxRequired == "Y":
                        char = max(input_list)
                        maxRequired = "N"
                    else :
                        char = self.getNextSmallElement(result[len(result) - 1], input_list)
                        print("D --"+char)
                        if char == "*":
                            operation_flag = "ASC"
                            minRequired = "Y"
                            continue

                result.append(char)
                input_list.remove(char)

            return ''.join(result)

        else:  # for empty input string

            return ''.join(result)

    """
        This function will return the next greater element than the last appended element.
        If the greater element is not found then it returns -1 means that you need start with smaller elements again
    """

    def getNextLargeElement(self, last_element: str, input_list: list):
        input_list.sort()
        for x in input_list:
            if x > last_element:
                return x

        return "*";

    def getNextSmallElement(self, last_element: str, input_list: list):
        input_list.sort(reverse=True)
        print(input_list)
        for x in input_list:
            if x < last_element:
                return x

        return "*"


s = Solution();
print(s.sortString("leetcode"))
# s.sortString("ujcgdn");
