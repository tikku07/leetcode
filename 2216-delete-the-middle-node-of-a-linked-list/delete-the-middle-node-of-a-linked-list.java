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
//Brute force
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        temp=head;
        int mid=(cnt/2)+1;
       while(temp!=null){
 mid--;
       if(mid==1) break;
            temp=temp.next;
       }


        
        
        
        temp.next=temp.next.next;
        return head;
    }
}

//optimal
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Base case: if 0 or 1 node, returning null is correct
        if (head == null || head.next == null) return null;
        
        // Start fast two steps ahead so slow stops right before the middle
        ListNode slow = head;
        ListNode fast = head.next.next;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        // slow is now exactly before the middle node
        slow.next = slow.next.next;
        return head;
    }
}

