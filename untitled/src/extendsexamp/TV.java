package extendsexamp;

public class TV {
    String brand;
    byte size;
    TV(){ }
    TV(String brand,byte size){
        this.brand=brand;
        this.size=size;
    }
    void output(){
        System.out.println("电视剧品牌是："+this.brand+";尺寸是："+this.size);
    }
}
