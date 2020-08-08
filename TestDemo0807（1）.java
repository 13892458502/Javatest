//import com.sun.istack.internal.localization.NullLocalizable;
//
//import java.util.Scanner;
//
//public class TestDemo {
////    public static boolean login(String password){
////        int i = 0;
////        String input;
////        while (i<3){
////            try {
////                System.out.println("请输入密码");
////                Scanner sc = new Scanner(System.in);
////                input = sc.nextLine();
////                if(password.compareTo(input)==0){
////                    return true;
////                }
////            } catch (NullPointerException e){
////                System.out.println("错误出现:空指针异常");
////            }
////            i++;
////        }
////        return false;
////    }
//    public static void login(String userName, String password) {
//        if (!TestDemo.userName.equals(userName)) {
//        }
//        if (!TestDemo.password.equals(password)) {
//        }
//        System.out.println("登陆成功");
//    }
//}
//
//    public static void main(String[] args) {
//        System.out.print("请设置密码:");
//        Scanner sc = new Scanner(System.in);
//        String password = sc.nextLine();
//        System.out.println(login(password));
//    }
//}

import java.util.Scanner;

public class TestDemo {
    private static String userName = "jack";
    private static String password = "123456";
    public static void login(String userName, String password) {
        int i = 0;
            if (!TestDemo.userName.equals(userName) || !TestDemo.password.equals(password)) {
                System.out.println("用户名或密码输入错误");
                return;
            }
        System.out.println("登陆成功");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入用户名和密码:");
            String user = sc.nextLine();
            String pass = sc.nextLine();
            login(user, pass);
            i++;
        }
        System.out.println("输入密码次数达到上限");
    }
}