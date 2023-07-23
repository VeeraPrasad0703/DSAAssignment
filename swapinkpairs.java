// Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

// You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [2,1,4,3,5]
// Example 2:


// Input: head = [1,2,3,4,5], k = 3
// Output: [3,2,1,4,5]

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode res=new ListNode();
        res.next=head;
        ListNode cur=res;
        ListNode prev=res;
        ListNode next=res;
        while(cur.next!=null)
        {
            cur=cur.next;
            count++;
        }
        while(count>=k)
        {
            cur=prev.next;
            next=cur.next;
            for(int i=1;i<k;i++)
            {
                cur.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=cur.next;
            }
            prev=cur;
            count-=k;
            
        }
        return res.next;
    }
}
