import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Login {
    public static void main(String[] args) {
        User user=new User("admin","admin");

    for(int i=1;i<=3;i++){
        System.out.println("请输入用户名：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("请输入密码：");
        String password=scanner.nextLine();
        if (name.equals(user.getName()) && password.equals(user.getPassword())){
            System.out.println("登陆成功");
            Game.start();
            break;
        }else {
            if (i<3){
                System.out.println("登陆失败，你还有"+(3-i)+"次机会");
            }else{
                System.out.println("登陆失败，账号被锁定");
                break;
            }
        }

    }


    }
}
