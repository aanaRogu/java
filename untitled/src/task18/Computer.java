package task18;

public class Computer {
    USB[] usbs=new USB[3];

    public void on() {
        for (int i=0;i<usbs.length;i++){
            usbs[i].open();
        }
        System.out.println("计算机开机成功");
    }

    public void off() {
        for (int i=0;i<usbs.length;i++){
            usbs[i].open();
        }
        System.out.println("计算机关机成功");
    }
    public void add(USB usb){
        for (int i=0;i<usbs.length;i++){
            if (usbs[i]==null){
                usbs[i]=usb;
                break;
            }
        }
    }

}
