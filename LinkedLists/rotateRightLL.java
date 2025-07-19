public class rotateRightLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode temp=head;
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            length++;
            tail=tail.next;
        }
        if(k%length==0) return head;
        k=k%length;
        int lastNode = length-k;
        tail.next=head;
        while(lastNode-1!=0){
            lastNode--;
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}