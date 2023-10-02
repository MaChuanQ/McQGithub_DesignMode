package base.wrapper;

import base.Item;
import base.Packing;

//纸质包装可以包汉堡
public abstract class Wrapper_Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
