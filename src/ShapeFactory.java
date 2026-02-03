

public class ShapeFactory {
    public ShapeSelctor getShape(String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
        }
        return null;
    }
}
