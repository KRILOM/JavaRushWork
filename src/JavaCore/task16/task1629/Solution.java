package JavaCore.task16.task1629;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();

        t1.join();
        t2.join();


        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{


        String string1, string2, string3;

        {
            try {
                string1 = reader.readLine();
                string2 = reader.readLine();
                string3 = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public void printResult() {
            System.out.println(string1 + " " + string2 + " " + string3);
        }
    }
}
//1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
//2. В методе run реализовать чтение с консоли трех строк.
//3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
//4. В методе main вывести результат для каждой нити.
//5. Используй join.
//
//Пример:
//
//Входные данные:
//a
//b
//c
//d
//e
//f
//
//Выходные данные:
//a b c
//d e f
//Требования:
//•	Объяви в классе Solution public static класс Read3Strings.
//•	Класс Read3Strings должен быть унаследован от Thread.
//•	Метод run класса Read3Strings должен считывать три строки.
//•	Класс Read3Strings должен содержать публичный метод printResult.
//•	Метод printResult должен выводить в консоль 3 считанные строки, разделив их пробелами.
//•	Метод main должен вызывать методы start у созданных нитей.
//•	Метод main должен вызывать методы join у созданных нитей.
//•	Вывод программы должен отображать, что потоки считывали строки последовательно, а не параллельно.
