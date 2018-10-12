//https://leetcode.com/problems/merge-two-sorted-lists/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode a = l1.val <= l2.val ? l1: l2;
        ListNode b = l1.val > l2.val ? l1: l2;
        ListNode output = new ListNode(a.val);
        ListNode reallyOutput = output;
        while (a != null){
            while (b != null && b.val >= a.val && (a.next == null || b.val < a.next.val)){
                ListNode temp = new ListNode(b.val);
                System.out.println(b.val);
                output.next = temp;
                b = b.next;
                output = output.next;
            }
            if (a.next != null){
                ListNode temp2 = new ListNode(a.next.val);
                System.out.println(a.next.val);
                output.next = temp2;               
            }
            output = output.next;
            a = a.next;
        }
        return reallyOutput;
    }
}


public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}