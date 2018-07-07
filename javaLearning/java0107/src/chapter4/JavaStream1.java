package chapter4;
//下面的程序读取和显示字符行直到你输入了单词"end"
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStream1 {
    public static void main(String []args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str=br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }
}
