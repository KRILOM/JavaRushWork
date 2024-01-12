package JavaCore.task15.task1518;

/*
Статики и котики
*/

public class Solution {
    public static Cat cat;

    static{
        cat = new Cat();
        cat.name = "Brsik";
        System.out.println(cat.name);
    }
    public static class Cat{
        public String name;

    }

    public static void main(String[] args) {

    }
}
//В этой задаче тебе нужно:
//
//    Создать класс Cat с публичным полем name типа String в классе Solution.
//    В статическом блоке создать объект типа Cat и инициализировать им переменную cat (не забудь инициализировать поле name).
//    В статическом блоке вывести имя созданного кота на экран.
//
//Примечание: не создавай конструкторы с параметрами в классе Cat.
//
//Требования:
//
//    •
//    Класс Cat должен быть создан внутри класса Solution и быть публичным и статическим.
//    •
//    В классе Cat должно быть публичное поле name типа String.
//    •
//    Переменная cat должна быть инициализирована в статическом блоке класса Solution.
//    •
//    В статическом блоке на экран должно быть выведено имя созданного кота.
//    •
//    Класс Cat не должен содержать конструкторы с параметрами.
