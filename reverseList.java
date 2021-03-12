public class reverseList {
    public static void main(String[] args) {
        System.out.println(reverseList(null));
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode p = null;
        while(head.next != null){
            ListNode h = head.next;
            head.next = p;
            p = head;
            head = h;
        }
        head.next = p;
        return head;
    }
}
