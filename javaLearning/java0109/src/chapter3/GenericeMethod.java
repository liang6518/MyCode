package chapter3;

public class GenericeMethod {
    public static <E> void printArarry(E[] inputArarry){
        for (E element:inputArarry){
            System.out.printf("%s ",element);
        }
        System.out.println("\n");
    }
    public static void main(String []args){
        Integer [] intArarry={1,2,3,4,5};
        Double [] doubleArarry={1.1,2.2,3.3,4.4,5.5};
        Character [] charArarry={'H','E','L','L','O'};
        printArarry(intArarry);
        printArarry(doubleArarry);
        printArarry(charArarry);
    }
}
