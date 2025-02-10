package Array;

public class Array01 {
    public static void main(String[] args) {
        double[] hens = {1, 2, 3.4, 4.5, 2.5, 8, 3.8};
        double weight = 0;
        for (int i = 0; i < hens.length; i++) {
            weight += hens[i];
        }
        System.out.println("总重量=" + weight + ", 平局重量=" + weight / hens.length);
    }
}
