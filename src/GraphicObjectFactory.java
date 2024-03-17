import java.util.HashMap;
import java.util.Map;

class GraphicObjectFactory {
    private static final Map<String, GraphicObject> objects = new HashMap<>();

    public static GraphicObject getLine(int x1, int y1, int x2, int y2) {
        String key = x1 + "," + y1 + "," + x2 + "," + y2;
        if (!objects.containsKey(key)) {
            objects.put(key, new Line(x1, y1, x2, y2));
        }
        return objects.get(key);
    }

    public static GraphicObject getRectangle(int x1, int y1, int x2, int y2) {
        String key = x1 + "," + y1 + "," + x2 + "," + y2;
        if (!objects.containsKey(key)) {
            objects.put(key, new Rectangle(x1, y1, x2, y2));
        }
        return objects.get(key);
    }

    public static GraphicObject getTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        String key = x1 + "," + y1 + "," + x2 + "," + y2 + "," + x3 + "," + y3;
        if (!objects.containsKey(key)) {
            objects.put(key, new Triangle(x1, y1, x2, y2, x3, y3));
        }
        return objects.get(key);
    }
}
