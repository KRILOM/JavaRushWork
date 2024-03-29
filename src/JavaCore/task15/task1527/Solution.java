//package JavaCore.task15.task1527;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//
///*
//Парсер реквестов
//*/
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        URL url = new URL(reader.readLine());
//        String urlString = url.getQuery();
//
//        if (urlString.contains("obj")) {
//            objValue = urlString.substring(urlString.indexOf("=") + 1, urlString.length());
//            try {
//                double doubleValue = Double.parseDouble(objValue);
//                alert(doubleValue);
//            } catch (NumberFormatException e) {
//                alert(objValue);
//            }
//        }
//
//
//
//    }
//
//    public static void alert(double value) {
//        System.out.println("double: " + value);
//    }
//
//    public static void alert(String value) {
//        System.out.println("String: " + value);
//    }
//}
//
////Для решения этой задачи тебе нужно:
////
////    Считать с консоли URL-ссылку.
////    Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
////    URL содержит минимум 1 параметр.
////    Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
////    Если присутствует параметр obj, то передать его значение в нужный метод alert():
////        alert(double value) - для чисел (не забывай о том, что число может быть дробным);
////        alert(String value) - для строк.
////    Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
////
////    Пример 1
////
////    Ввод:
////    http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
////
////    Вывод:
////    lvl view name
////
////    Пример 2
////
////    Ввод:
////    http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
////
////    Вывод:
////    obj name
////    double: 3.14
////
////Требования:
////
////    •
////    Программа должна считывать с клавиатуры только одну строку.
////    •
////    Класс Solution не должен содержать статические поля.
////    •
////    Программа должна выводить данные на экран в соответствии с условием.
////    •
////    Программа должна вызывать метод alert() с параметром double, если значение параметра obj можно корректно преобразовать в число типа double.
////    •
////    Программа должна вызывать метод alert() с параметром String, если значение параметра obj нельзя корректно преобразовать в число типа double.