package ss13_search_algorithm.thuc_hanh.cai_dat_thuat_toan_tim_kiem_nhi_phan;

public class BinarySearch {
    static int[] list = {1,2,3,4,5,6,7,8,9,10};


    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                  high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                 low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Vị trí của số 3 trong mảng là : " + binarySearch(list , 3));
    }
}

