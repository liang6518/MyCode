package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//下面的程序示范了用 read() 方法从控制台不断读取字符直到用户输入 "q"。
public class JavaStream {
    public static void main(String []args) throws IOException{
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        do {
            c=(char)br.read();
            System.out.println(c);
        }while (c!='q');
    }
}
