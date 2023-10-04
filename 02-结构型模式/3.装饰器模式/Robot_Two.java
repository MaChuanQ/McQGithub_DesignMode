/*
* 具体装饰器：在第一代机器人的基础上，让机器人会跳舞
* 1.调用第一代机器人中的功能
* 2.添加让机器人跳舞的代码
* */
public class Robot_Two extends Robot_Decorator{
    public Robot_Two(Robot robot) {
        super(robot);
    }

    @Override
    public void doSomeThing() {
        robot.doSomeThing();
        dance();
    }

    public void dance(){
        System.out.println("跳舞");
    }
}
