package ss5_access_modifier_static_method_static_property.thuc_hanh.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

     Car(String n, String e) {
        this.name = n;
        this.engine = e;
        numberOfCars++;
    }

    public String getName() {
        return this.name;
    }

    public String getEngine() {
        return this.engine;
    }
}


