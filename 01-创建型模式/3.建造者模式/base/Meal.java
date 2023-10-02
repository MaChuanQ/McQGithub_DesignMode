package base;

import java.util.ArrayList;
import java.util.List;

//菜单类：可以增加项目，查看项目，得到价格
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItem(){
        for (Item item : items){
            System.out.println("名称："+item.name());
            System.out.println("包装类型："+item.packing().pack());
            System.out.println("价格："+item.price());
        }
    }
}
