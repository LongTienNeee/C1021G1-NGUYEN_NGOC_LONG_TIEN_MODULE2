package ss5_access_modifier_static_method_static_property.thuc_hanh.static_property;

 public class TestStaticProperty {
    public static void main(String[] args){
        Car car1 = new Car("Bự", "Xịn1");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Tăng" ,"Xịn2");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("Rác", "Vừa");
        System.out.println(Car.numberOfCars);
    }
}
