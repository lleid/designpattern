package com.leo.prototype;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 缓存类，存储数据库中获取的对象，放到Hashtable中
 */
public class ShapeCache {

    private static Hashtable<String, Shape> cache = new Hashtable<String, Shape>();

    public static Shape getShape(String id) {
        Shape shape = cache.get(id);
        try {
            return (Shape) shape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void addShape(Shape shape) {
        cache.put(shape.getId(), shape);
    }
}
