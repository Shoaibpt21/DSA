/*
                    LEETCODE 142
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
public class LinkedListCycleNode {

        public ListNode startingPointLoop(ListNode head,ListNode fast,ListNode slow){
            slow = head;
            while(slow != fast){
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    return startingPointLoop(head,fast,slow);
                }
            }
            return null;
        }
}
*/