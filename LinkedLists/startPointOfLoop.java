import java.util.*;
public class startPointOfLoop {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        int count = 0; 
        while(temp!=null){
            if(head == null || head.next == null) return null;
            if(map.containsKey(temp)){
                return temp;
            }
            else{
                map.put(temp, count);
                count++;
                temp = temp.next;
            }
        }
        return null;    
    }

    public ListNode detectCycleTortoiseHare(ListNode head) {
        ListNode slow = head, fast = head;
        if(head == null || head.next == null) return null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
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
