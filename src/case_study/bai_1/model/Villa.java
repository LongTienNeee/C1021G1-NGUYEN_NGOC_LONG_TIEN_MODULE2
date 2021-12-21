package case_study.bai_1.model;

import case_study.bai_1.model.Furama;

public class Villa extends Furama {
    private byte roomStandardVilla;
    private double areaPoolVilla;
    private int numberOfFloorVilla;

    public Villa(String nameOfService,
                 double areaToUse,
                 double feeToRent,
                 int maximumCustomer,
                 byte roomStandard,
                 double areaPool,
                 int numberOfFloor) {
        super(nameOfService, areaToUse, feeToRent, maximumCustomer);
        this.roomStandardVilla = roomStandard;
        this.areaPoolVilla = areaPool;
        this.numberOfFloorVilla = numberOfFloor;
    }

    public byte getRoomStandardVilla() {
        return roomStandardVilla;
    }

    public void setRoomStandardVilla(byte roomStandardVilla) {
        this.roomStandardVilla = roomStandardVilla;
    }

    public double getAreaPoolVilla() {
        return areaPoolVilla;
    }

    public void setAreaPoolVilla(double areaPool) {
        this.areaPoolVilla = areaPool;
    }

    public int getNumberOfFloorVilla() {
        return numberOfFloorVilla;
    }

    public void setNumberOfFloorVilla(int numberOfFloor) {
        this.numberOfFloorVilla = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "nameOfService='" + getNameOfService() + '\'' +
                ", areaToUse=" + getAreaToUse() +
                ", feeToRent=" + getFeeToRent() +
                ", maximumCustomer=" + getMaximumCustomer() +
                "roomStandard=" + getRoomStandardVilla() +
                ", areaPool=" + getAreaPoolVilla() +
                ", numberOfFloor=" + getNumberOfFloorVilla() +
                '}';
    }
}


