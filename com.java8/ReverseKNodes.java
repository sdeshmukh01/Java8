public class ReverseKNodes {


    public static class ListNode {
        ListNode next;
        int data;
        int length;

        public ListNode(ListNode next, int data) {
            this.next = next;
            this.data = data;
            length++;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            length++;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(null,4);
        ListNode node3 = new ListNode(node4,3);
        ListNode node2 = new ListNode(node3,2);
        ListNode node1 = new ListNode(node2,1);

        reverseKNodes(node1, 2);

    }

    public static ListNode reverseKNodes(ListNode node, int k) {

        ListNode current = node;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;

        while(current != null && count < k){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
            count++;
        }
        if(node != null){
            node.next = current;
        }
        count = 0;

        while(count < k && current !=null){
            current = current.next;
            count++;
        }

        if(current != null ){
            current.next = reverseKNodes(current.next, k);
        }
        return prev;
    }
}

