package extendsexamp;

public class VIPUniversity extends University {
    @Override
    void enter(){
        if(math+english+chinese+sport>=290){
            double x;
            x=math+english+chinese+sport;
            System.out.println("恭喜！四门课程总分为："+x+",达到重点大学的录取线");
        }else {
            System.out.println("抱歉！未被录取。");
        }
    }
}
