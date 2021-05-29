package duotai;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver=new Driver();
        BMW bmw=new BMW();
        QQ qq=new QQ();
        driver.run(bmw);
        driver.run(qq);

    }
}
