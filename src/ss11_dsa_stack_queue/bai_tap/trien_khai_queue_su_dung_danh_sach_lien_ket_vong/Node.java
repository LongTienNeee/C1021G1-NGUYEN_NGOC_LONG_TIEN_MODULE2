package ss11_dsa_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

public class Node {
    public int data;
    public Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
