public class reverseKGroups {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null){
            ListNode kthNode=getKthNode(temp, k);
            if(kthNode==null){
                if(prevNode!=null) prevNode.next=temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthNode;
            }
            else{
                prevNode.next = kthNode;
            }
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }
    
    public ListNode getKthNode(ListNode temp, int k){
        k = k-1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }

    public ListNode reverse(ListNode temp){
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    
}