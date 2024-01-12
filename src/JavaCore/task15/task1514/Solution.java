package JavaCore.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/*
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.1, "1");
        labels.put(2.2, "2");
        labels.put(2.3, "3");
        labels.put(2.4, "4");
        labels.put(2.5, "5");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
//В статическом блоке инициализируй labels пятью различными парами ключ-значение.
//Требования:
//
//    •
//    В классе Solution должен быть только один метод — main().
//    •
//    В классе Solution должно быть объявлено статическое поле labels типа Map.
//    •
//    Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
//    •
//    Метод main должен выводить содержимое labels на экран.