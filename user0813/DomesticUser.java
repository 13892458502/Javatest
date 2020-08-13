package user;

import operation.*;

import java.util.Scanner;

public class DomesticUser extends User{
    public DomesticUser(String name) {
        super.name = name;
        super.iOperations = new IOperation[] {
                new Exit(),
                new AccessBook(),
                new BorrowBook(),
                new ReturnBook()
        };
    }

    @Override
    int menu() {
        System.out.println("用户"+name+"欢迎你登陆图书管理系统");
        System.out.println("请选择您需要的操作");
        System.out.println("========================");
        System.out.println("1、查找图书");
        System.out.println("2、借阅图书");
        System.out.println("3、归还图书");
        System.out.println("0、退出系统");
        System.out.println("========================");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
