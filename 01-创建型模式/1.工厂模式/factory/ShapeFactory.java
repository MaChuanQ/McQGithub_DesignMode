package factory;

import factory_interface.Shape;
import factory_interface.impl.Circle;
import factory_interface.impl.Rectangle;
import factory_interface.impl.Square;

public class ShapeFactory {
    //equalsIgnoreCase:在忽略大小写的情况下，比较两个字符串是否一样
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        } else if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}
