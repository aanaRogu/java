import java.util.Scanner;

/**
 * @author Administrator
 */
public class Game {
    public static void start() {
        int random = (int) (Math.random() * 10 );
        int guess = -1;
        while (guess != random) {
            System.out.println("请输入猜测的数字（0-10）:");
            Scanner scanner=new Scanner(System.in);
             guess=scanner.nextInt();
            if (guess>random){
                System.out.println("大了");
            }else if (guess<random){
                System.out.println("小了");
            }else{
                System.out.println("恭喜！猜对了！");
            }
        }
    }
}
