public class ReverseLL2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int d = right - left;
        ListNode temp = head;
        ListNode leftPrev = null;
        while(left>1){
            leftPrev = temp;
            temp = temp.next;
            left--;
        }
        ListNode leftN = temp;
        while(d!=0){
            temp = temp.next;
            d--;
        }
        ListNode rightN = temp;
        ListNode rightNext = rightN.next;
        ListNode newRight = reverse(leftN, rightNext);
        leftN.next = rightNext;
        if(leftPrev == null){
            return rightN; //rightN  newRight
        }
        else{
            leftPrev.next = rightN;
            return head;
        }
    }
    public ListNode reverse(ListNode node1, ListNode node2){
        ListNode prev = null;
        ListNode temp = node1;
        while(temp!=node2){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
