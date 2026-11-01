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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N=0;
        ListNode temp=head;
        while(temp!=null){
            N++;
            temp=temp.next;
        }
        int idx=N-n;
        if(idx==0){
            return head.next;
        }
        temp=head;
        for(int i=0;i<N;i++){
            if((i+1)==idx){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}
