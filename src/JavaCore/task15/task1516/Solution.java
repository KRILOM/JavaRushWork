package JavaCore.task15.task1516;

/*
Значения по умолчанию
*/

public class Solution {

    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;
    public static void main(String[] args) {
        System.out.println(new Solution().intVar);
        System.out.println(new Solution().doubleVar);
        System.out.println(new Solution().DoubleVar);
        System.out.println(new Solution().booleanVar);
        System.out.println(new Solution().ObjectVar);
        System.out.println(new Solution().ExceptionVar);
        System.out.println(new Solution().StringVar);
    }
}
//В этой задаче тебе нужно:
//
//    Создать 7 нестатических public полей класса:
//    intVar типа int
//    doubleVar типа double
//    DoubleVar типа Double
//    booleanVar типа boolean
//    ObjectVar типа Object
//    ExceptionVar типа Exception
//    StringVar типа String
//    Убедиться, что они инициализируются дефолтными значениями.
//    Вывести их значения в заданном порядке в методе main()
//
//Требования:
//
//    •
//    В классе Solution должно быть объявлено поле intVar типа int.
//    •
//    В классе Solution должно быть объявлено поле doubleVar типа double.
//    •
//    В классе Solution должно быть объявлено поле DoubleVar типа Double.
//    •
//    В классе Solution должно быть объявлено поле booleanVar типа boolean.
//    •
//    В классе Solution должно быть объявлено поле ObjectVar типа Object.
//    •
//    В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
//    •
//    В классе Solution должно быть объявлено поле StringVar типа String.
//    •
//    Метод main должен выводить значения полей на экран (каждое — с новой строки или через пробел) в заданном порядке. Инициализировать переменные не нужно.
