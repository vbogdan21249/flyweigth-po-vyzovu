import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GraphicObject line1 = GraphicObjectFactory.getLine(0, 0, 100, 100);
        GraphicObject line2 = GraphicObjectFactory.getLine(0, 0, 100, 100);

        GraphicObject rectangle1 = GraphicObjectFactory.getRectangle(10, 10, 50, 50);
        GraphicObject rectangle2 = GraphicObjectFactory.getRectangle(10, 10, 50, 50);

        GraphicObject triangle1 = GraphicObjectFactory.getTriangle(0, 0, 50, 50, 100, 0);
        GraphicObject triangle2 = GraphicObjectFactory.getTriangle(0, 0, 50, 50, 100, 0);

        line1.draw();
        line2.draw();
        rectangle1.draw();
        rectangle2.draw();
        triangle1.draw();
        triangle2.draw();
    }
}
