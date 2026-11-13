/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode p1 = head;
        ListNode p2 = head;
        

        if( p1 == null || p1.next ==null){
            return false;
        }

        p1=p1.next;
        p2=p2.next.next;

        
        while(p2!=null && p2.next != null){
            if(p1==p2){
                return true;
            }
            p1=p1.next;
            p2=p2.next.next;
        }

        return false;

    
    }
}