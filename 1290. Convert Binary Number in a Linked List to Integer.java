/*
1290. Convert Binary Number in a Linked List to Integer

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

Example 1:

Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        ArrayList<Integer> digits = new ArrayList<Integer>();
        
        ListNode tempNode = head;
        
        while(tempNode != null){
            System.out.println(tempNode.val);
            digits.add(tempNode.val);
            tempNode = tempNode.next;
        }
        
        int sum = 0;
        for(int digitsLen = digits.size(), i = (digitsLen); i > 0; i--){
            
            sum = sum + (digits.get(i-1) * (int)Math.pow(2, digitsLen - i));
        }
        
        return sum;
    }
}