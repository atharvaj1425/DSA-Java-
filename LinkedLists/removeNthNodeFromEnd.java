public class removeNthNodeFromEnd {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEndLengthApproach(ListNode head, int n) {
        if(head==null || head.next==null)return null;
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(length==n){
            return head.next;
        }
        int nodeBeforeTarget=length-n; 
        temp=head;
        while(temp!=null){
            nodeBeforeTarget--;
            if(nodeBeforeTarget==0){
                ListNode deleteNode = temp.next;
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
        }
        return null;
    }

    public ListNode removeNthFromEndTwoPointer(ListNode head, int n) {
        if(head==null || head.next==null)return null;
        ListNode fast=head, slow=head;
        for(int i=0; i<n; i++){
            fast=fast.next;
            if(fast==null){
                return head.next;
            }
        }   
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode deleteNode = slow.next;
        slow.next = slow.next.next;
        return head;
    }
}