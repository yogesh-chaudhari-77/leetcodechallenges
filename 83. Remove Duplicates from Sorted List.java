/**

83. Remove Duplicates from Sorted List

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Input: head = [1,1,2]
Output: [1,2]

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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp = head;
        
        while(temp != null){
            
            if(temp.next == null){
                break;    
            }
            
            int currentNodeVal = temp.val;
            int nextNodeVal = temp.next.val;
            
            if(currentNodeVal == nextNodeVal){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
            
        }
        
        return head;
        
    }
}