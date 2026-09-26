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
//BRUTE FORCE 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=head;
       int cnt=0;
       while(temp!=null) {
        temp=temp.next;
        cnt++;

       }
       temp=head;
       if(cnt==n) return head.next;
      
      temp = head;
        int res = cnt - n - 1; // stop one node short
        for (int i = 0; i < res; i++) {
            temp = temp.next;
        }
       temp.next=temp.next.next;
       
       return head;
    }
}

//optimal
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        for( int i=0;i<n;i++){
            fast=fast.next;

        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

    }
}
