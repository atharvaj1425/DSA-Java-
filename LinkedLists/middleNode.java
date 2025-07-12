public class middleNode {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode middleNodeBruteforce(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        int middleNode = (count/2) + 1;
        temp = head;
        while(temp!=null){
            middleNode--;
            if(middleNode==0){
                break;
            }
            temp=temp.next;
        }
        return temp;
    }

    public static ListNode middleNodeHareTortoise(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
        
}

