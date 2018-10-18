//https://leetcode.com/problems/remove-linked-list-elements/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

	ListNode output;
	Boolean isHead = true;

    public ListNode removeElements(ListNode head, int val) {
    	if (head == null) {
    		return null;
    	}
        if (isHead) {
        	if (head.next == null && head.val == val) return null;
        	if (head.next != null && head.val == val) {
        		output = head.next;
        		return removeElements(head.next,val);
        	}
        	output = head;
        	isHead = false;
        }
    	if (head.next == null) return output;
    	if (head.next.val == val){
    		if (head.next.next == null) {
    			head.next = null;
    			return output;
    		}else {
    			head.next = head.next.next;
    		}
    		return removeElements(head,val);
    	}
    	return removeElements(head.next,val);
    }
}