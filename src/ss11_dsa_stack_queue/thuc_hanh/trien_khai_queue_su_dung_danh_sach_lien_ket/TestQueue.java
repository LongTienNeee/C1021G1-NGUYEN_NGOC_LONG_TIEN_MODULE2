package ss11_dsa_stack_queue.thuc_hanh.trien_khai_queue_su_dung_danh_sach_lien_ket;

public class TestQueue {
    public static void main(String[] args) {
        MyLinkListQueue queue = new MyLinkListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(2);
        System.out.println(queue.dequeue().key);
    }
}
