package start;

public class Loop {
    public static void main(String[] args) {
//        for循环
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("你好小" + i);
//        }
//        int count = 0;
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 9 == 0) {
//                count++;
//                sum = sum + i;
//            }
//        }
//        System.out.println("100中能整除9的数有" + count + "个，且总和为" + sum);
//        int i = 1;//初始变量
//        while (i <= 10) {//循环条件，满足则进入循环，不满足则不进入循环
//            System.out.println("循环第" + i + "次了");
//            i++;//循环变量迭代
//        }
//        int i = 1;
//        do {
//            System.out.println("第" + i + "次循环");
//            i++;
//        } while (i <= 10); // while (i < 0);先执行一次do语句的程序，再判断是否满足循环条件
//        System.out.println("循环结束");
//        int sum = 0;
//        for(int i = 1; i <= 100; i++) {
//            sum += i;
//            if (sum > 20){
//                break;//结束正在进行当前循环，直接执行循环后的用当前循环后的语句
//            }
//            System.out.println("执行了break后的循环语句并且sum = " + sum);
//        }
//        System.out.println("循环结束后的sum=" + sum);
        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 2) {
                continue;//结束本次循环，直接从下一次循环开始
            }
            System.out.println("输出结果：i = " + i);
        }
//        输出结果：i = 3
//        输出结果：i = 4
//        输出结果：i = 5

    }
}
