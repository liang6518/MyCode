public class Test2 {
    public static void main(String args[]){

        long result=0;
        long f=1;
        for(int i=1;i<=10;i++){
            f=f*i;
            result=result+f;
        }

        System.out.println("result="+result);
    }
}
