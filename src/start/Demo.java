package start;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        int i = 1;
//        int j = 1;
//        for ( i = 1; i <= 9; i++) {
//            for ( j = 1; j <= i; j++) {
//                System.out.print( i + "*" + j + "=" + i*j + "  " );
//            }
//            System.out.println();
//        }
        System.out.println("请输入一个数字：");
        int i = new Scanner(System.in).nextInt();
        if (i >= 0) {
            System.out.println(i + "是整数");
        } else {
            System.out.println(i + "是负数5");
        }
        }
}
