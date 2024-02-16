package JavaCore.task16.task1619;

/*
А без interrupt слабо?
*/
//without interrupt();
public class Solution {

    public static boolean end = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        end = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!end) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
//Разберись, как работает программа.
//Реализуй метод ourInterruptMethod таким образом, чтобы он прерывал нить TestThread. Исправь остальной код программы, если это необходимо. Нельзя использовать метод interrupt.
//Требования:
//•	В классе Solution должен быть публичный статический метод ourInterruptMethod без параметров.
//•	Метод run должен выводить надпись "he-he" каждые пол секунды, пока не будет вызван метод ourInterruptMethod.
//•	Необходимо изменить условие цикла while в методе run.
//•	Метод main должен создавать объект типа Thread передавая в конструктор объект типа TestThread.
//•	Метод main должен вызывать метод start у объекта типа Thread.
//•	Метод main должен вызывать метод ourInterruptMethod.