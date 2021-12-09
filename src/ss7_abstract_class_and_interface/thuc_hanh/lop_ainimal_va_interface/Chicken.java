package ss7_abstract_class_and_interface.thuc_hanh.lop_ainimal_va_interface;


public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cục tác cục tác";
    }

    @Override
    public String howToEat() {
        return "eat rice";
    }
}
