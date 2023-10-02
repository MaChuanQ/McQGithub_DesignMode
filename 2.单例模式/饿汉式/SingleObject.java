package 饿汉式;

public class SingleObject {
    //1.让构造器私有化，这样这个类就不会被实例化
    private SingleObject() {}
    //2.创建一个静态实例
    private static SingleObject instance = new SingleObject();
    //3.通过静态方法获取这个静态实例
    public static SingleObject getInstance(){
        return instance;
    }
    //4.显示信息
    public void messageShow(){
        System.out.println("singleObject mode");
    }
}
