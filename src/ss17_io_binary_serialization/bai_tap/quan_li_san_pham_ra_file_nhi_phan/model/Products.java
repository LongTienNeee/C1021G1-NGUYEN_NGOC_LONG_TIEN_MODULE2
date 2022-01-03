package ss17_io_binary_serialization.bai_tap.quan_li_san_pham_ra_file_nhi_phan.model;

public class Products {
    private int idProduct ;
    private String nameProduct;
    private String company;
    private double price;
    private String description;

    public Products(int idProduct, String nameProduct, String company, double price, String description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.company = company;
        this.price = price;
        this.description = description;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Products{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
