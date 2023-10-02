package 懒汉式;

//最基本的实现方式
public class SingletonDemo {
    public static void main(String[] args) {
        SingletonUnSynchronized instance = SingletonUnSynchronized.getInstance();
        instance.messageShow();

        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
        instance1.messageShow();
    }
}
