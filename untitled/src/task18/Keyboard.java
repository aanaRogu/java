package task18;

public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("键盘启动了");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭了");

    }
}
