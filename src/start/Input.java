package start;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//      创建一个Scanner的类
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的名字：");
//       当程序执行到next时会等待输入
        String name = scanner.nextLine();
        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入您的薪水：");
        double salary = scanner.nextDouble();
        System.out.println("姓名：" + name + ",年龄：" + age + ",薪水：" + salary + ".");
    }
}
