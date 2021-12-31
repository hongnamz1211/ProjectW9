package baitap.factorymethod;

public class ShapeFactory {
    public Shape getShape(String name){
        if ("circle".equals(name)){
            return new Circle();
        } else if ("rectangle".equals(name)){
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
