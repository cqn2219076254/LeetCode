public class removeElements {
    public static void main(String[] args) {
        System.out.println(removeElements(null, 1));
    }

    public static ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        ListNode pointer = head;
        while(pointer != null && pointer.next != null){
            while(pointer.next!=null && pointer.next.val==val){
                pointer.next = pointer.next.next;
            }
            pointer = pointer.next;
        }
        return head;
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
