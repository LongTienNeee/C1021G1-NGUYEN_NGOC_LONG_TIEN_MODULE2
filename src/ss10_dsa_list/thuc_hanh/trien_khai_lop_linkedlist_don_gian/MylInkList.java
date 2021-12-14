package ss10_dsa_list.thuc_hanh.trien_khai_lop_linkedlist_don_gian;

public class MylInkList {
    private  Node head;
    private  int numNodes;

    public void MyLinkList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}

