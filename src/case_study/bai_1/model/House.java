package case_study.bai_1.model;

import case_study.bai_1.model.Furama;

public class House extends Furama {
    private byte roomStandardHouse;
    private int numberOfFloorHouse;

    public House(String nameOfService,
                 double areaToUse,
                 double feeToRent,
                 int maximumCustomer,
                 byte roomStandard,
                 int numberOfFloor) {
        super(nameOfService, areaToUse, feeToRent, maximumCustomer);
        this.roomStandardHouse = roomStandard;
        this.numberOfFloorHouse = numberOfFloor;
    }
        public byte getRoomStandardHouse() {
            return roomStandardHouse;
        }

        public void setRoomStandardHouse(byte roomStandardHouse) {
            this.roomStandardHouse = roomStandardHouse;
        }

        public int getNumberOfFloorHouse() {
            return numberOfFloorHouse;
        }

        public void setNumberOfFloorHouse(int numberOfFloorHouse) {
            this.numberOfFloorHouse = numberOfFloorHouse;
        }

    @Override
    public String toString() {
        return "House{" +
                "nameOfService='" + getNameOfService() + '\'' +
                ", areaToUse=" + getAreaToUse() +
                ", feeToRent=" + getFeeToRent() +
                ", maximumCustomer=" + getMaximumCustomer() +
                "roomStandardHouse=" + getRoomStandardHouse() +
                ", numberOfFloorHouse=" + getNumberOfFloorHouse() +
                '}';
    }
}


