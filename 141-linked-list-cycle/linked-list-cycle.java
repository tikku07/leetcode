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
        HashMap <ListNode,Integer>ht=new HashMap<>();
        ListNode temp=head;
        
        while(temp!=null){
            if(ht.containsKey(temp)) return true;
            else{
                ht.put(temp,1);
            }
            temp=temp.next;
        }
        return false;
    }
}