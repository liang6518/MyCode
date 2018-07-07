package chapter4;

import java.io.File;

//创建目录：下面的例子创建 "/tmp/user/java/bin"文件夹：
public class JavaStream3 {
    public static void main(String []args){
        String dirname="/tmp/user/java/bin";
        File d=new File(dirname);
        d.mkdirs();
    }
}
