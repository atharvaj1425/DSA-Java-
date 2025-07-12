import java.util.Stack;
public class reverseLL {
  public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode reverseListUsingStack(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        Stack<Integer> st = new Stack<>();
        while(curr!=null){
            st.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            curr.val=st.pop();
            curr = curr.next;
        }
        return head;
    }
    
    public ListNode reverseListSwapMethod(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public ListNode reverseListUsingRecurssion(ListNode head) {
        ListNode newHead = reverseListUsingRecurssion(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}

