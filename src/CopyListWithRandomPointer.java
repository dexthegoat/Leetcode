import java.util.HashMap;

/**
 * A linked list is given such that each node contains an additional random pointer
 * which could point to any node in the list or null.
 *
 * Return a deep copy of the list.
 *
 * The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
 *
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) where random pointer points to,
 * or null if it does not point to any node.
 *
 * Example 1:
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 */
public class CopyListWithRandomPointer {

    HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {

        if (head == null) return null;

        if (this.visitedHash.containsKey(head)) {
            return visitedHash.get(head);
        }

        Node node = new Node(head.val);

        visitedHash.put(head, node);

        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;

    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node() {

    }

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

}

