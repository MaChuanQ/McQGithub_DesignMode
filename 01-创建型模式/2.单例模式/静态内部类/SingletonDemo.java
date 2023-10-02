package 静态内部类;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.messageShow();
    }
}
