public class detectCycle {
    public static void main(String[] args) {
        System.out.println(detectCycle(null));
    }

    public static ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                ListNode i = head;
                ListNode j = fast;
                while(i != j){
                    i = i.next;
                    j = j.next;
                }
                return i;
            }
        }
        return null;
    }
}
