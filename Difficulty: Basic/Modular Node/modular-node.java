/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/
// Your task is to complete the function
// function should return the modular Node
// if no such node is present then return -1
class Solution {
    public int modularNode(Node head, int k) {
        // Code here//Position this line where user code will be pasted.
        int index = 0;
        int ans = -1;
        while(head!=null){
            index++;
            if(index%k==0){
                ans = head.data;
            }
            head=head.next;
        }
        return ans;
    }
}