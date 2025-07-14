import java.util.Stack;

public class pallindromeLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public boolean isPalindromeStack(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.val!=st.pop()){
                return false;
            }
            else{
                temp=temp.next;
            }
        }
        return true;
    }

    public ListNode reverse(ListNode head){
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

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode fast = head, slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead = reverse(slow.next);

        ListNode first = head, second = newHead;

        while(second!=null){
            if(first.val!=second.val){
                reverse(newHead);
                return false;
            }
            else{
                first=first.next;
                second=second.next;
            }
        }
        reverse(newHead);
        return true;
    }
}
