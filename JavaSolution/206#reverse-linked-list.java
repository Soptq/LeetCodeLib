//https://leetcode.com/problems/reverse-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    	if (head == null) return null;
    	ListNode output,temp;
    	output = head;
        while (head.next != null){
        	ListNode tempList = head.next;
        	if (head.next.next == null){
        		head.next = null;
        	}else head.next = head.next.next;
        	tempList.next = output;;
        	output = tempList;
        }
        return output;
    }
}