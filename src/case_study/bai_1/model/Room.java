package case_study.bai_1.model;

import case_study.bai_1.model.Furama;

public class Room extends Furama {
    private String freeServiceInclude;

    public Room(String nameOfService,
                double areaToUse,
                double feeToRent,
                int maximumCustomer,
                String freeServiceInclude) {
        super(nameOfService, areaToUse, feeToRent, maximumCustomer);
        this.freeServiceInclude = freeServiceInclude;
    }

    public String getFreeServiceInclude() {
        return freeServiceInclude;
    }

    public void setFreeServiceInclude(String freeServiceInclude) {
        this.freeServiceInclude = freeServiceInclude;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameOfService='" + getNameOfService() + '\'' +
                ", areaToUse=" + getAreaToUse() +
                ", feeToRent=" + getFeeToRent() +
                ", maximumCustomer=" + getMaximumCustomer() +
                "freeServiceInclude='" + getFreeServiceInclude() + '\'' +
                '}';
    }
}
