 public ListNode reverseList(ListNode head) {
        ListNode prev = null, next = null, cur = head;
        
        while(cur!=null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
}
