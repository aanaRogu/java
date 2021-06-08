package task18;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer=new Computer();
        USB mouse=new Mouse();
        USB keyboard=new Keyboard();
        USB mic=new Mic();
        computer.add(mouse);
        computer.add(keyboard);
        computer.add(mic);
        computer.on();
        computer.off();
    }
}
