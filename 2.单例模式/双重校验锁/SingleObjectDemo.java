package 双重校验锁;

public class SingleObjectDemo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.messageShow();
    }
}
