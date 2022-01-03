package ss19_design_pattern.thuc_hanh.factory_method;

public class FactoryAnimals {
    public Animals getAnimals(String type){
        if("canine".equals(type)){
            return new Dog();
        } else {
            return new Cat();
        }
    }
}

