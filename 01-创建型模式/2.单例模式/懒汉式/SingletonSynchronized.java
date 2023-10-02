package 懒汉式;

public class SingletonSynchronized {
    private SingletonSynchronized(){}

    private static SingletonSynchronized instance;

    public static synchronized SingletonSynchronized getInstance(){
        if(instance == null){
            instance = new SingletonSynchronized();
        }
        return instance;
    }

    public void messageShow(){
        System.out.println("懒汉式-线程安全");
    }
}
