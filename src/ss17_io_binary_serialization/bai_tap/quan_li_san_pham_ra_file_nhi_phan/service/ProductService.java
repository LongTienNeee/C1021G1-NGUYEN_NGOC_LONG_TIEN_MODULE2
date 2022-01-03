//package ss17_io_binary_serialization.bai_tap.quan_li_san_pham_ra_file_nhi_phan.service;
//
//import ss17_io_binary_serialization.bai_tap.quan_li_san_pham_ra_file_nhi_phan.model.Products;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ProductService implements IProduct {
//    private List<Products> listProduct = new ArrayList<>();
//    private static Scanner scanner = new Scanner(System.in);
//
//    public void addNewAProduct() {
//        System.out.println("Nhập mã sản phẩm");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập Tên Sản Phẩm");
//        String nameProduct = scanner.nextLine();
//        System.out.println("Nhập Hãng Sản Xuất");
//        String company = scanner.nextLine();
//        System.out.println("Nhập Giá Của Sản Phẩm");
//        double price = Double.parseDouble(scanner.nextLine());
//        System.out.println("Nhập mô tả cho sản phẩm");
//        String description = scanner.nextLine();
//        Products products = new Products(id, nameProduct, company, price, description);
//        listProduct.add(products);
//    }
//
//}
//
//    public void displayAllProducts() {
//        for (Products product : listProduct) {
//            System.out.println(product);
//        }
//    }
//
//    public void SearchProduct() {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
//            String productName = scanner.nextLine();
//            for (Products product : listProduct) {
//                if (product.getNameProduct().equals(productName)) {
//                    System.out.println(product);
//                }
//            }
//        }catch (Exception e ){
//
//        }
//    }
//}
