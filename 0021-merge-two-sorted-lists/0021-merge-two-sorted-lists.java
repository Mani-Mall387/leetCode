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
    // public class ListNode {
    //   int val;
    //   ListNode next;
    //   ListNode() {}
    //   ListNode(int val) { this.val = val; }
    //   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    // }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode t= null;
        ListNode newl= new ListNode(-1);
        ListNode temp= newl;

        if(l1==null && l2==null){
            return null;
        }
        while( l1!= null && l2!=null  ){
            if(l1.val < l2.val){
                newl.next=l1;
                l1=l1.next;
                newl=newl.next;
            }else{
                newl.next=l2;
                l2=l2.next;
                newl=newl.next;

            }
        }

        while(l1!=null){
            newl.next=l1;
            l1=l1.next;
                            newl=newl.next;

        }
        while(l2 != null){
            newl.next=l2;
            l2=l2.next;
                            newl=newl.next;

        }

        return temp.next;

    }
}