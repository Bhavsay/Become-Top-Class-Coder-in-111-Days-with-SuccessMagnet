/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x){
         // Case 1: empty list
        if (head == null) {
            return head;
        }

        // Case 2: delete first node
        if (x == 1) {
            return head.next;
        }

        Node p = head;

        // Move p to (x-1)th node
        for (int i = 1; i < x - 1 && p.next != null; i++) {
            p = p.next;
        }

        // Delete xth node
        if (p.next != null) {
            p.next = p.next.next;
        }

        return head;
        
    }
    
}