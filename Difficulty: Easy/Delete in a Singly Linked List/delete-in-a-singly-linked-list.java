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
        
        Node p = head, q = head;
        
        // Case 2: delete first node
        if (x == 1) {
            return head.next;
        }



        // Move p to (x-1)th node
        for (int i = 1; i < x - 1; i++) {
            p = p.next;
        }
        q=p.next;
        p.next = p.next.next;
        

        return head;
        
    }
    
}