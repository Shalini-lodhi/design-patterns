
public class FactoryDemo {
    public static void main(String[] args) {
        // Get instances from Factory instead of using 'new'
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
