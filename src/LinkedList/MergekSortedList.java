package LinkedList;

import java.util.PriorityQueue;

/**
 * Example 1:
 * <p>
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 * Example 2:
 * <p>
 * Input: lists = []
 * Output: []
 * Example 3:
 * <p>
 * Input: lists = [[]]
 * Output: []
 */

public class MergekSortedList {

    public static void main(String[] args) {

        ListNode foo1 = new ListNode(1);
        ListNode foo2 = new ListNode(4);
        ListNode foo3 = new ListNode(5);
        ListNode foo4 = new ListNode(1);
        ListNode foo5 = new ListNode(3);
        ListNode foo6 = new ListNode(4);
        ListNode foo7 = new ListNode(2);
        ListNode foo8 = new ListNode(6);
        foo1.next = foo2;
        foo2.next = foo3;
        foo4.next = foo5;
        foo5.next = foo6;
        foo7.next = foo8;
        ListNode[] lists = new ListNode[] {foo1, foo4, foo7};

        ListNode res = new MergekSortedList().mergeKLists(lists);
        System.out.println(res); // 11234456
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length,
                (o1, o2) -> o1.val - o2.val);
        // 升序o1.val - o2.val 降序o2.val - o1.val

        ListNode foo = new ListNode(0);
        ListNode tail = foo;

        for (ListNode node : lists) if (node != null) queue.add(node);


        while (!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null) {
                // 优先级队列入队
                queue.add(tail.next);
            }
        }
        return foo.next;
    }
}
