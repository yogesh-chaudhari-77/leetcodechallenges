# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getDecimalValue(self, head):
        """
        :type head: ListNode
        :rtype: int
        """
        binary_list = []
        while head != None :
            binary_list.append(head.val)
            head = head.next;

        number = 0
        i = len(binary_list) - 1
        power = 0
        while i >= 0:
            val = binary_list[i] * (2 ** power)
            number += val
            i -= 1
            power += 1
        return number


s = Solution()
s.getDecimalValue([1])
