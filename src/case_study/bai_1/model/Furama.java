package case_study.bai_1;

public class Furama {
    private String nameOfService ;
    private double areaToUse;
    private double feeToRent;
    private int maximumCustomer;
    //còn thiếu kiểu thuê


    public Furama(String nameOfService,
                  double areaToUse,
                  double feeToRent,
                  int maximumCustomer) {
        this.nameOfService = nameOfService;
        this.areaToUse = areaToUse;
        this.feeToRent = feeToRent;
        this.maximumCustomer = maximumCustomer;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getAreaToUse() {
        return areaToUse;
    }

    public void setAreaToUse(double areaToUse) {
        this.areaToUse = areaToUse;
    }

    public double getFeeToRent() {
        return feeToRent;
    }

    public void setFeeToRent(double feeToRent) {
        this.feeToRent = feeToRent;
    }

    public int getMaximumCustomer() {
        return maximumCustomer;
    }

    public void setMaximumCustomer(int maximumCustomer) {
        this.maximumCustomer = maximumCustomer;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "nameOfService='" + getNameOfService() + '\'' +
                ", areaToUse=" + getAreaToUse() +
                ", feeToRent=" + getFeeToRent() +
                ", maximumCustomer=" + getMaximumCustomer() +
                '}';
    }
}

