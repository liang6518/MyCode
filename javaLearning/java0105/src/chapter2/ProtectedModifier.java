package chapter2;

public class ProtectedModifier {
    protected boolean count(int c){
        return true;
    }
    class StreamingProtectedModifier extends ProtectedModifier{
        protected boolean count(int c){
            return true;
        }
    }
}
