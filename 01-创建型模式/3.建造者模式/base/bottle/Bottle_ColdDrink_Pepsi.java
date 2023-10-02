package base.bottle;

//冷饮可以是百事可乐
public class Bottle_ColdDrink_Pepsi extends Bottle_ColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
