package FirstWeek.Factory;

public class factoryPatternDemo {
    public static void main(String[] args) {
       shapeFactory shapeFactory = new shapeFactory();
       shape draw = shapeFactory.getShape("Rectangle");
       draw.draw();
    }
}
