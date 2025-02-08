package start;

public class StringToBasic {
    public static void main(String[] args) {
//      基本数据类型的使用
        int n1 = 100;
        float f1 = 1.1f;
        double d1 = 3.2d;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        String s5 = "123";
        int num1 = Integer.parseInt(s5);
        float num2 = Float.parseFloat(s5);
        double num3 = Double.parseDouble(s5);
        long num4 = Long.parseLong(s5);
        boolean num5 = Boolean.parseBoolean("true");
        byte num6 = Byte.parseByte(s5);
        short num7 = Short.parseShort(s5);
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
        System.out.println(s5.charAt(1));
    }
}
