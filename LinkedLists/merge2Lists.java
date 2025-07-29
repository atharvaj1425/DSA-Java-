public class merge2Lists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode n1 = list1;
        ListNode n2 = list2;
        ListNode curr = new ListNode(-1);
        while(n1!=null && n2!=null){
            if(n1.val<=n2.val){
                curr.next = n1;
                curr = n1;
                n1 = n1.next;
            }
            else {
                curr.next = n2;
                curr = n2;
                n2 = n2.next;
            }
            
        }
        if(n2!=null) curr.next = n2;
        else curr.next = n1;
        return list1.val<=list2.val?list1:list2;
    }
}
