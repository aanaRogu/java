package duotai;

public class AnimalTest {
    public static void main(String[] args) {
        //利用多太创建两个对象
        //多太：引用是父累，指向子类
        Animal kitty=new Cat();
        Animal bobi=new Dog();
        kitty.speak();
        bobi.speak();
    }
}
