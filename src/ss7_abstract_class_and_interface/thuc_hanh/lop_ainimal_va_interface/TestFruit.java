package ss7_abstract_class_and_interface.thuc_hanh.lop_ainimal_va_interface;

public class TestFruit {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for(Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
