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

// Brute force 
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack <Integer> st= new Stack <>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
              temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(st.peek() != temp.val) return false;
            st.pop();
            temp=temp.next;
        }
        return true;
    }
}

//optimal

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode newHead= reverse(slow.next);
       ListNode first=head;
       ListNode second=newHead;
       while(first!=null && second !=null){
        if(first.val!=second.val) return false;
        first=first.next;
        second=second.next;
       }
    return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
  ListNode front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
        }
      
        return prev;
    }
}
