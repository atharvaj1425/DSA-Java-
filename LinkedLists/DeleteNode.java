public class DeleteNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Invalid node");
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
