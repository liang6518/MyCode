package chapter4;
import java.io.File;
//读取目录下面展示的例子说明如何使用 list() 方法来检查一个文件夹中包含的内容：
//为什么结果和网站上运行的不一样
public class JavaStream4 {
    public static void main(String []args){
        String dirname="/tmp";
        File f1=new File(dirname);
        if (f1.isDirectory()){
            System.out.println(dirname);
            String s[]=f1.list();
            for (int i=0;i<s.length;i++){
                File f=new File(dirname+"/"+s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i]+"是一个目录");
                }
                else{
                    System.out.println(s[i]+"是一个文件");
                }
            }
        }
        else {
            System.out.println(dirname + " 不是一个目录");
        }
    }
}
