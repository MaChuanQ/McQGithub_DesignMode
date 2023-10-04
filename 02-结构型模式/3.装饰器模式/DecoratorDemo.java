public class DecoratorDemo {
    public static void main(String[] args) {
        new Robot_Two(new Robot_First()).doSomeThing();
    }
}
