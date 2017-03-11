package leetcode_21_merge_two_sorted_lists;

public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode(0);
        ListNode lastNode = resultList;
        
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                lastNode.next = l1;
                l1 = l1.next;
            } else {
                lastNode.next = l2;
                l2 = l2.next;
            }
            lastNode = lastNode.next;
        }
        
        if(l1 != null) {
            lastNode.next = l1;
        } else {
            lastNode.next = l2;
        }
        
        return resultList.next;
    }
}