package ss11_dsa_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int key) {
        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }

    public Node deQueue(int key) {
        if (this.front == null)
            return null;
        Node temp = this.front;
        this.front = this.front.link;
        if (this.front == null)
            this.rear = null;
        return temp;
    }

    public void displayQueue(){
        System.out.println();
    }
}

