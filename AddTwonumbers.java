class ListNode{
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val; 
    }
}
public class AddTwonumbers {
  public static ListNode addTwoNumbers(ListNode l1 , ListNode l2){
    ListNode dummy = new ListNode(0);  //dummy node
    ListNode current = dummy; //pointer to build the result
    int carry=0;
    while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
                       
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next; // skip dummy
    }
    public static void main(String[] args) {
        // Example: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        // Print result: should be 7 -> 0 -> 8
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
     
    }
}
