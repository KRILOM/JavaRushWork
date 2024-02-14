package JavaCore.task16.task1626;

/*
Создание по образцу
*/

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countIndexUp = 1;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexUp += 1;
                    Thread.sleep(500);
                    if (countIndexUp == number+1) return;

                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
//Разберись, как работает программа.
//По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number.
//Требования:
//•	Класс CountUpRunnable должен реализовывать интерфейс Runnable.
//•	Класс CountUpRunnable должен иметь публичный метод run без параметров.
//•	Метод run класса CountUpRunnable должен работать примерно 2,5 секунды.
//•	Метод run класса CountUpRunnable должен каждые полсекунды выводить имя потока, двоеточие и значение счетчика от 1 до 5 (например: "Увеличиваем: 1").
//•	Метод run класса CountUpRunnable должен вызывать Thread.sleep(500).
