import java.util.*;

public class mergeKLists {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(2);
        ListNode n8 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n4.next = n5;
        n5.next = n6;
        n7.next = n8;
        ListNode result = mergeKLists(new ListNode[]{n1, n4, n7});
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        int n = lists.length;
        Queue<ListNode> listNodeQueue = new PriorityQueue<>(n, valComparator);
        for (ListNode list : lists) {
            if (list != null) {
                listNodeQueue.add(list);
            }
        }
        if(listNodeQueue.isEmpty()) return null;
        ListNode root = listNodeQueue.poll();
        ListNode now = root;
        if(now.next != null) listNodeQueue.add(now.next);
        while(!listNodeQueue.isEmpty()){
            now.next = listNodeQueue.poll();
            now = now.next;
            if(now.next != null) {
                listNodeQueue.add(now.next);
            }
        }
        return root;
    }

    public static Comparator<ListNode> valComparator = new Comparator<ListNode>(){
        @Override
        public int compare(ListNode n1, ListNode n2) {
            return n1.val - n2.val;
        }
    };

    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
