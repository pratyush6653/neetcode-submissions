/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode>st=new Stack<>();
        ListNode curr=head;
        int length=0;
        while(curr!=null ){
            st.push(curr);
            length=length+1;
            curr=curr.next;
        }
        curr=head;
         for (int i = 0; i < length / 2; i++) {
            ListNode last = st.pop();

            ListNode nextNode = curr.next;
            curr.next = last;
            last.next = nextNode;

            curr = nextNode;
        }

        curr.next = null; 
    }
}
