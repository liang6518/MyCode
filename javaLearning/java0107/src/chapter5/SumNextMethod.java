package chapter5;

import java.util.Scanner;

public class SumNextMethod {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int m=0;
        double sum=0;
        while (scan.hasNextDouble()){
            m+=1;
            sum+=scan.nextDouble();
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值是"+(sum/m));
    }
}
