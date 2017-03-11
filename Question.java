package leetcode_21_merge_two_sorted_lists;

/*
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */

public class Question {
	public static void main(String args[]) {
		ListNode l1 = new ListNode(6);
		ListNode l2 = new ListNode(1);
		ListNode resultList = new ListNode(0);
		
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(3);
		
		resultList = Solution.mergeTwoLists(l1,l2);
		
		while(resultList != null) {
			System.out.print(resultList.val);
			resultList = resultList.next;
		}
	}
}
