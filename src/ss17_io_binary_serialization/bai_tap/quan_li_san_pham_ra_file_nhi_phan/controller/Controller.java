//package ss17_io_binary_serialization.bai_tap.quan_li_san_pham_ra_file_nhi_phan.controller;
//
//import ss17_io_binary_serialization.bai_tap.quan_li_san_pham_ra_file_nhi_phan.service.IProduct;
//import ss17_io_binary_serialization.bai_tap.quan_li_san_pham_ra_file_nhi_phan.service.ProductService;
//
//import java.util.Scanner;
//
//public class Controller {
//    public static void main(String[] args) {
//        IProduct iProduct = new ProductService();
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("1. Thêm sản phẩm");
//            System.out.println("2. Hiển thị các sản phẩm");
//            System.out.println("3. Tìm kiếm sản phẩm");
//            System.out.println("4. Thoát");
//            int choose = Integer.parseInt(scanner.nextLine());
//            switch (choose) {
//                case 1:
//                    iProduct.addNewAProduct();
//                    break;
//                case 2:
//                    iProduct.displayAllProducts();
//                    break;
//                case 3:
//                    iProduct.SearchProduct();
//                    break;
//                case 4:
//                    System.exit(0);
//                    break;
//
//            }
//
//        } while (true);
//    }
//}
