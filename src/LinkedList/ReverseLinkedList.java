package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head){

        if(head == null){
            return null;
        }else if(head.next == null){
            return head;
        }

        ListNode newHead = new ListNode(0);
        ListNode temp = head;
        ListNode next = null;

        while (temp != null){
            next = temp.next;
            temp.next = newHead.next;
            newHead.next = temp;
            temp = next;
        }
        return newHead.next;
    }
}
