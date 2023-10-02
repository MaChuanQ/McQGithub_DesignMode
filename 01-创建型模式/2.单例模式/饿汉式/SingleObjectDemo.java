package 饿汉式;

public class SingleObjectDemo {
    public static void main(String[] args) {
        //这样是错误的，因为SingleObject的构造器被私有化了
        //SingleObject singleObject = new SingleObject();

        //通过单例模式提供的对外访问的静态方法获取这个实例
        SingleObject instance = SingleObject.getInstance();
        //通过这个实例获取该类中的其它方法
        instance.messageShow();
    }
}
