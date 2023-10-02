package base.wrapper;

//汉堡可以是肌肉汉堡
public class Wrapper_Burger_Chicken extends Wrapper_Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
