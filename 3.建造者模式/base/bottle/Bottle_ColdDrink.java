package base.bottle;

import base.Item;
import base.Packing;

//瓶子可以装冷饮
public abstract class Bottle_ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
