package ss3_reverse_element_in_loop.bai_tap.them_phan_tu_vao_mang;

import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] arrName = {"Long","Tiên","Khoa","Hải"};
        String[] arrNameAdd = new String[arrName.length + 1];
        int i = 0;

        System.out.println("Enter index want to add a element");
        int index = input.nextInt();

        System.out.println("Enter the element");
        String name = input.nextLine();

      for(String element : arrName){
          arrNameAdd[i] = element;
          i++;
      }
      System.out.println("Array before add : " + Arrays.toString(arrName));

      for(int j = index ; j < arrNameAdd.length; j++){
          arrNameAdd[j+1] = arrNameAdd[j];
      }
      arrNameAdd[index] = name;
      System.out.println("Array after add : " + Arrays.toString(arrNameAdd));
    }
}
