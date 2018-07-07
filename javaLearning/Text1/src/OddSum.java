public class OddSum {
    public static void main(String args[]){
        int result=0;
        int i=1;
        for(;i<100;i=i+2){
            result=result+i;
        }
        System.out.println("result="+result);
    }
}