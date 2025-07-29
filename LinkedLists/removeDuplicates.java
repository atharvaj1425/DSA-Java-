public class removeDuplicates {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        if(head==null) return null;
        ListNode curr = head.next;
        ListNode temp = head;
        while(curr!=null){
            if(temp.val != curr.val){
                temp.next = curr;
                temp = curr;
            }
            curr = curr.next;
        }
        temp.next = null;
        return head;
    }
}