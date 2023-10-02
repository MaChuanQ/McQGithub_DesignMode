package 懒汉式;

public class SingletonUnSynchronized {
    private static SingletonUnSynchronized instance;
    private SingletonUnSynchronized(){}

    public static SingletonUnSynchronized getInstance(){
        if (instance == null) {
            instance = new SingletonUnSynchronized();
        }
        return instance;
    }
    public void messageShow(){
        System.out.println("懒汉式-线程不安全");
    }
}
