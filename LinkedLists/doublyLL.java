public class doublyLL {
    public static class Node {
        int data;      // Data stored in the node
        Node next;    // Reference to the next node in the list
        Node prev;    // Reference to the previous node in the list

        // Constructor for a Node with both data and references to the next and previous nodes
        public Node(int data1, Node next1, Node prev1) {
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
        }

        // Constructor for a Node with data and no reference to the next node (end of the list)
        public Node(int data1) {
            this.data = data1;
            this.next = null;
            this.prev = null;
        }
    }


    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from the array and set its 'back' pointer to the previous node
            Node temp = new Node(arr[i], null, prev);
            // Update the 'next' pointer of the previous node to point to the new node
            prev.next = temp;
            // Move 'prev' to the newly created node for the next iteration
            prev = temp;
        }
        // Return the head of the doubly linked list
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            // Print the data in the current node
            System.out.print(head.data + " ");
            // Move to the next node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
    
    // Function to insert a new node with value 'k' at the end of the doubly linked list
    private static Node insertAtTail(Node head, int k) {
        // Create a new node with data 'k'
        Node newNode = new Node(k);
    
        // If the doubly linked list is empty, set 'head' to the new node
        if (head == null) {
            return newNode;
        }
    
        // Traverse to the end of the doubly linked list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
    
        // Connect the new node to the last node in the list
        current.next = newNode;
        newNode.prev = current;
    
        return head;
    }

    // Function to delete the tail of the doubly linked list
    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null; // Return null if the list is empty or contains only one element
        }
        
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        
        Node newtail = tail.prev;
        
        newtail.next = null;
        tail.prev = null;
        
        return head;
    }

    // Function to delete the head of the doubly linked list
    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null; // Return null if the list is empty or contains only one element
        }
        
        Node prev = head;
        head = head.next;

        head.prev = null; // Set 'prev' pointer of the new head to null
        prev.next = null; // Set 'next' pointer of 'prev' to null
        
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);
        
        // Print the doubly linked list
         System.out.println("Doubly Linked List Initially: ");
        print(head);

        System.out.println("Doubly Linked List After Inserting before the node with value 10:");

        head = insertAtTail(head, 10); // Insert a node with value 10 at the end
        print(head);

        System.out.println("Doubly Linked List after deleting tail node: ");
        head = deleteTail(head);
        print(head);

        System.out.println("Doubly Linked List after deleting head node: ");
        head = deleteHead(head);
        print(head);
    }
}
