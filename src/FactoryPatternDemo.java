
public class FactoryPatternDemo {
    public static void main(String[] args) {
       ShapeFactory shapeFactory = new ShapeFactory();
       ShapeSelctor draw = shapeFactory.getShape("Circle");
       draw.draw();
    }
}
