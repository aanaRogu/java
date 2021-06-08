package task18;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭了");

    }
}
