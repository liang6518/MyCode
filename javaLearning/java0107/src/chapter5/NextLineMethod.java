package chapter5;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("nextLine方式接收：");
        if (scan.hasNext()){
            String str2=scan.nextLine();
            System.out.println("输入的数据为："+str2);
        }
    }
}
