package ss7_abstract_class_and_interface.thuc_hanh.lop_ainimal_va_interface;

public class TestAbstractAndInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal: animals){
            System.out.println(animal.makeSound());
        }
    }
}
