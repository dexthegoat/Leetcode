package LinkedList;

public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode(0);
        ListNode first = head;
        temp.next = head;
        int len = 0;
        while (first != null) {
            len++;
            first = first.next;
        }
        len -= n;
        first = temp;
        while (len > 0) {
            len--;
            first = first.next;
        }
        first.next = first.next.next;
        return temp.next;
    }
}
