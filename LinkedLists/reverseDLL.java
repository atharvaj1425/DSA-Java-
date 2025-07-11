import java.util.*;
public class reverseDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data1, Node next1, Node prev1) {
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
        }

        public Node(int data1) {
            this.data = data1;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i], null, prev);
             prev.next = newNode;
            prev = newNode;
        }
        return head;
    }

    public static void printDll(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseDllUsingStack(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp!=null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node reverseDllBySwaping(Node head){
        Node current = head;
        Node temp = null;
        while(current!=null){
            temp = current.prev; // save the previous node
            current.prev = current.next; // swap next and prev
            current.next = temp; // swap next and prev
            current = current.prev;
        }
        return temp == null ? head : temp.prev;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArr2DLL(arr);
        printDll(head);
        Node reverse = reverseDllUsingStack(head);
        printDll(reverse);
        Node reverse2 = reverseDllBySwaping(reverse);
        printDll(reverse2);
    }
}
