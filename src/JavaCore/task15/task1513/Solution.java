package JavaCore.task15.task1513;

/*
Максимально простой код-3
*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {

    }

    public class Car extends Machine {

    }
}

// Упрости код:
//
//    убери все наследования классов, которые автоматически добавятся при компиляции;
//    убери все конструкторы, которые создаются и добавляются автоматически.
//
//Требования:
//
//    •
//    В классе Car не должно быть явно реализованных конструкторов без параметров.
//    •
//    В классе Machine не должно быть явно реализованных конструкторов без параметров.
//    •
//    Класс Car должен быть потомком класса Machine.
//    •
//    В коде не должно быть явного наследования от Object (extends Object).
//    •
//    Класс Car не должен явно наследовать интерфейс Runnable.