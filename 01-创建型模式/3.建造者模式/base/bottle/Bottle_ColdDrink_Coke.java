package base.bottle;

//冷饮可以是可口可乐
public class Bottle_ColdDrink_Coke extends Bottle_ColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
