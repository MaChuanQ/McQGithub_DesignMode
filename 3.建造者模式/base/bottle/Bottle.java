package base.bottle;

import base.Packing;

//瓶子包装
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
