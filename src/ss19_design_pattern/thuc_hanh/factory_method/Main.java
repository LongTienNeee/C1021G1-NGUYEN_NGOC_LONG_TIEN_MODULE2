package ss19_design_pattern.thuc_hanh.factory_method;

public class Main {
    public static void main(String[] args) {
        FactoryAnimals factoryAnimals = new FactoryAnimals();

        Animals a1 = factoryAnimals.getAnimals("feline");
        System.out.println("a1 sound : " + a1.makeSound());

        Animals a2 = factoryAnimals.getAnimals("canine");
        System.out.println("a1 sound : " + a2.makeSound());
    }
}
