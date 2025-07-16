public class twinSumLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int pairSum(ListNode head) {
        ListNode temp = head;
        ListNode first = head;
        int n=0;
        int maxSum = Integer.MIN_VALUE;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHead = reverse(slow);
        while(first!=slow && secondHead!=null){
            int twinSum = first.val + secondHead.val;
            maxSum = Math.max(maxSum, twinSum);
            first=first.next;
            secondHead=secondHead.next;
        }
        return maxSum;
    }
    public ListNode reverse(ListNode secondHead){
        ListNode prev=null;
        ListNode temp=secondHead;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;            
        }
        return prev;
    }
    public int pairSumTwoPointer(ListNode head){
        ListNode temp = head;
        int n=0;
        int maxSum = Integer.MIN_VALUE;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        for(int i=0; i<n/2; i++){
            int count = 0;
            ListNode first = head;
            while(count<i){
                first=first.next;
                count++;
            }
            ListNode second = head;
            count = 0;
            while(count<n-1-i){
                second = second.next;
                count++;
            }
            int twinSum = first.val + second.val;
            maxSum = Math.max(twinSum, maxSum);
        }
        return maxSum;
    }

}
