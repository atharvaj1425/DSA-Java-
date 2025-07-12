import java.util.HashMap;
public class detectLoop {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Boolean> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(map.containsKey(temp)){
                return true;
            }
            else {
                map.put(temp, true);
                temp = temp.next;
            }
        }
        return false;   
    }

    public boolean hasCycleHareTortoiseMethod(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            if(head==null || head.next==null) return false;
            
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    return true;
                }
        }
        return false;
    }

}
