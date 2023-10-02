package 双重校验锁;

public class SingleObject {
    private volatile static SingleObject instance;
    private SingleObject(){}

    public static SingleObject getInstance(){
        synchronized (SingleObject.class){
            if (instance == null) {
                instance = new SingleObject();
            }
        }
        return instance;
    }

    public void messageShow(){
        System.out.println("单例模式-双重校验锁");
    }
}
