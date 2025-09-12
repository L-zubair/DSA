// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        // If list is empty or has only 1 element, return it
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip duplicate node
                current.next = current.next.next;
            } else {
                // Move to next node
                current = current.next;
            }
        }

        return head; // modified list
    }

    // Test the solution
    public static void main(String[] args) {
        // Example: head = [1,1,2,3,3]
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        DeleteDuplicates dd = new DeleteDuplicates();
        ListNode result = dd.deleteDuplicates(head);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected Output: 1 2 3
    }
}
