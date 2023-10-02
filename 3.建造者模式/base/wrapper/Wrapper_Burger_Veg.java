package base.wrapper;

//汉堡可以是蔬菜汉堡
public class Wrapper_Burger_Veg extends Wrapper_Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
