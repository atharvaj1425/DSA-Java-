class Node {
    int data;         // Data stored in the node
    Node next;        // Reference to the next node in the linked list
    // Constructor
    public Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    // Constructor
    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class Main {

    // Function to check if a given element is present in the linked list
    public static int checkifPresent(Node head, int desiredElement) {
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Check if the current node's data is equal to the desired element
            if (temp.data == desiredElement)
                return 1;  // Return 1 if the element is found

            // Move to the next node
            temp = temp.next;
        }

        return 0;  // Return 0 if the element is not found in the linked list
    }


    // Function to calculate the length of a linked list
    private static int lengthofaLL(Node head){
        int cnt=0;
        Node temp=head;
        // Traverse the linked list and count nodes
        while(temp!=null){
            temp = temp.next;
            cnt++;// increment cnt for every node traversed
        }
        return cnt;
    }

    // Function to delete the tail of the linked list
    private static Node deleteTail(Node head) {
        // Check if the linked list is empty or has only one node
        if (head == null || head.next == null)
            return null;
        // Create a temporary pointer for traversal
        Node temp = head;
        // Traverse the list until the second-to-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // Nullify the connection from the second-to-last node to delete the last node
        temp.next = null;
        // Return the updated head of the linked list
        return head;
    }

     // Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Function to insert a new node at the head of the linked list
    public static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 7};
        // Creating a new Node with the value from the array
        Node y = new Node(nums[0]);
        // Printing the data stored in the Node
        System.out.println(y.data);
        // Create a Node 'x' with the first element of the array
        Node x = new Node(nums[0]);
        // Create a reference 'z' pointing to the same Node 'x'
        Node z = x;
        // Print the reference 'z', which represents the memory address of the Node 'x'
        System.out.println(z);

        // Initialize an array with integer values
        int[] arr = {2, 5, 8, 7};
        // Create the linked list with nodes initialized with array values
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        // Delete the tail of the linked list
        head = deleteTail(head);
        // Print the modified linked list
        printLL(head);

        System.out.println(lengthofaLL(head));

        int val = 3;  // Element to be checked for presence in the linked list

        // Call the checkifPresent function and print the result
        System.out.print(checkifPresent(head, val));
        
    }
}