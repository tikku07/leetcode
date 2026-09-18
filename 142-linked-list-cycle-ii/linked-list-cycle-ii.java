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

//Brute Force

public class Solution {
    public ListNode detectCycle(ListNode head) {
         HashMap <ListNode,Integer>ht=new HashMap<>();
        ListNode temp=head;
        
        while(temp!=null){
            if(ht.containsKey(temp)) return temp;
            else{
                ht.put(temp,1);
            }
            temp=temp.next;
        }
        return null;
    }
}

//optimal

public class Solution {
    public ListNode detectCycle(ListNode head) {

         ListNode slow=head;
        ListNode fast=head;
while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast) {
        slow=head;
while(slow!=fast){
    
    slow=slow.next;
    fast=fast.next;
    
    }
    return slow;

}

    }
  return null;  
}
}
