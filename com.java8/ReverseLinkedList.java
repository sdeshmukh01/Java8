public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode listNode = list.reverseList(node1);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }


    public ListNode reverseList(ListNode head) {


        ListNode current = head;
        ListNode prev = null;
        ListNode next;



 while(current != null){

     next = current.next;
     current.next = prev;
     prev = current;
     current = next;
 }

return prev;
    }
}



