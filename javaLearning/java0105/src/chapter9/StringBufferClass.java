package chapter9;
//buffer是缓冲的意思,string类是不能够被修改的，的通过string buffer来修改
public class StringBufferClass {
    public static void main(String []args){
        StringBuffer strBuffer=new StringBuffer("李学亮ID：");
        strBuffer.append("今");
        strBuffer.append("夕");
        strBuffer.append("何");
        strBuffer.append("夕");
        strBuffer.append("！");
        System.out.println(strBuffer);


    }

}
