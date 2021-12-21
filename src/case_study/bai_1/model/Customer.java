package case_study.bai_1;

public class Customer {
    private int idCustomer;
    private String nameOfCustomer;
    private String dateOfBirthCustomer;
    private String sexCustomer;
    private int idNoCustomer;
    private double telephoneNumberCustomer;
    private String emailCustomer;
    private String typeCustomer;
    private String address;

    public Customer(int idCustomer,
                    String nameOfCustomer,
                    String dateOfBirthCustomer,
                    String sexCustomer,
                    int idNoCustomer,
                    double telephoneNumberCustomer,
                    String emailCustomer,
                    String typeCustomer,
                    String address) {
        this.idCustomer = idCustomer;
        this.nameOfCustomer = nameOfCustomer;
        this.dateOfBirthCustomer = dateOfBirthCustomer;
        this.sexCustomer = sexCustomer;
        this.idNoCustomer = idNoCustomer;
        this.telephoneNumberCustomer = telephoneNumberCustomer;
        this.emailCustomer = emailCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getDateOfBirthCustomer() {
        return dateOfBirthCustomer;
    }

    public void setDateOfBirthCustomer(String dateOfBirthCustomer) {
        this.dateOfBirthCustomer = dateOfBirthCustomer;
    }

    public String getSexCustomer() {
        return sexCustomer;
    }

    public void setSexCustomer(String sexCustomer) {
        this.sexCustomer = sexCustomer;
    }

    public int getIdNoCustomer() {
        return idNoCustomer;
    }

    public void setIdNoCustomer(int idNoCustomer) {
        this.idNoCustomer = idNoCustomer;
    }

    public double getTelephoneNumberCustomer() {
        return telephoneNumberCustomer;
    }

    public void setTelephoneNumberCustomer(double telephoneNumberCustomer) {
        this.telephoneNumberCustomer = telephoneNumberCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", nameOfCustomer='" + nameOfCustomer + '\'' +
                ", dateOfBirthCustomer='" + dateOfBirthCustomer + '\'' +
                ", sexCustomer='" + sexCustomer + '\'' +
                ", idNoCustomer=" + idNoCustomer +
                ", telephoneNumberCustomer=" + telephoneNumberCustomer +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
