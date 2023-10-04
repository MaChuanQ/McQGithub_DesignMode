/*
* 抽象装饰器：通过构造方法关联第一代机器人
* */
public abstract class Robot_Decorator implements Robot{
    protected Robot robot;
    public Robot_Decorator(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void doSomeThing() {
        robot.doSomeThing();
    }
}
