package Array;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        double[] scores = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
//            循环为数组输入元素
            scores[i] = sc.nextDouble();
        }
//        循环遍历数组的值
        for (int i = 0; i < scores.length; i++) {
            System.out.println("数组" + i + "=" + scores[i]);
        }
    }
}
