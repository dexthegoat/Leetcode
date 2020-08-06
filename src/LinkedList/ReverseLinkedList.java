package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(node1);
        System.out.println(new ReverseLinkedList().reverseList(node1));

    }

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode(0);
        ListNode temp = head;
        ListNode next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = newHead.next;
            newHead.next = temp;
            temp = next;
        }
        return newHead.next;
    }
}
