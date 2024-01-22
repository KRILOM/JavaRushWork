package JavaCore.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/*
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
//В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.
//Требования:
//
//    •
//    В методе main создай 5 объектов типа SpecialThread.
//    •
//    В методе main создай 5 объектов типа Thread.
//    •
//    Добавь 5 разных нитей в список list.
//    •
//    Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
//    •
//    Класс SpecialThread изменять нельзя.