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
    public int getDecimalValue(ListNode head) {
        ListNode l1=head;
        int n=0;
        
        while(l1!=null)
        {
            n++;
            l1=l1.next;
        }
        int sum=0;
        
        l1=head;
        while(l1!=null)
        {
            sum=sum + l1.val*(int)Math.pow(2,--n);
             l1=l1.next;
        }
        return sum;
    }
}