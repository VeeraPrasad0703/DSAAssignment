// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

// Example 1:


// Input: head = [1,2,3,4]
// Output: [2,1,4,3]
// Example 2:

// Input: head = []
// Output: []
// Example 3:

// Input: head = [1]
// Output: [1]
public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



class swapinpairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode res=head;
        ListNode next=res.next;
        while(res!=null && res.next!=null)
        {
            ListNode prev=res;
            res=res.next;
            prev.next=res.next;
            res.next=prev;
            res=prev.next;
            if(res!=null && res.next!=null) prev.next=res.next;
        }
        return next;

    }
}


//or 
//leetcode problem link
// https://leetcode.com/problems/swap-nodes-in-pairs/