package extendsexamp;

/**
 * @author Administrator
 */
public class CanonPrinter extends Printer{



    void clean(){
        System.out.println("清除");
    }
    @Override
    void close(){
        clean();
        System.out.println("关闭");
    }

}
