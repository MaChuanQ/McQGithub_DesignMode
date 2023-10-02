package 静态内部类;

public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public void messageShow(){
        System.out.println("单例模式-静态内部类");
    }
}
