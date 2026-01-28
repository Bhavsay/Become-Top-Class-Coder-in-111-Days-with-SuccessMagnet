/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Node p = head;
        while(p!=null){
            list.add(p.data);
            p=p.next;
        }
        return list;
        
        
    }
}
