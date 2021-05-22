package extendsexamp;

public class University {
    double math;
    double english;
    double chinese;
    double sport;
    void enter(){
        if(math+english+chinese>=180&&sport>=60){
            double x;
            x=math+english+chinese;
            System.out.println("恭喜！三门课程总分为："+x+"，且体育达标，达到大学录取线");
        }else{
            System.out.println("抱歉！落榜了。");
        }
    }

}
