package base.wrapper;

import base.Packing;

//纸质包装
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}
