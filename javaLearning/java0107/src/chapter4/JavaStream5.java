package chapter4;
import java.io.File;
//删除目录或文件
//不懂？？？
public class JavaStream5 {
    public static void main(String []args){
        File floder=new File("/tmp/java/");
        deleteFloder(floder);
    }
    public static void deleteFloder(File floder){
        File [] files=floder.listFiles();
        if (files!=null){
            for (File f:files){
                if (f.isDirectory()){
                    deleteFloder(f);
                }
                else{
                    f.delete();
                }
            }
        }
        floder.delete();
    }
}
