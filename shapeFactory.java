package FirstWeek.Factory;

public class shapeFactory {
    public shape getShape(String shape) {
        switch (shape) {
            case "Circle":
                return new circle();
            case "Rectangle":
                return new rectangle();
            case "Square":
                return new square();
        }
        return null;
    }
}
