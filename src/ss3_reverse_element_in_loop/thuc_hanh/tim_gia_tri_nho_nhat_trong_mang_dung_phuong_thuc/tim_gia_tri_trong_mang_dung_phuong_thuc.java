package ss3_reverse_element_in_loop.thuc_hanh.tim_gia_tri_nho_nhat_trong_mang_dung_phuong_thuc;

public class tim_gia_tri_trong_mang_dung_phuong_thuc {
    public static void main(String[] args){
        int[] arr = {6,21,88,-6,41,-5};
        System.out.println("Min of array is " + minOfArr(arr));
    }

    public static int minOfArr(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
