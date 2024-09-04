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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head;
        ListNode previous=head,current=head.next;
        ListNode head2=current;
        int i=0;
        while(current!=null && current.next!=null)
        {
            i++;
            previous.next=current.next;
            previous=current;
            current=current.next;   
        }
        if(i%2==1)
        {
            current.next=head2;
            previous.next=null;
        }
        else
            previous.next=head2;
        
        return head;
    }
}
