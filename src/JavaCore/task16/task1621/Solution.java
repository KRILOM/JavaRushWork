package JavaCore.task16.task1621;

/*
Thread.currentThread - всегда возвращает текущую нить
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) throws InterruptedException {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public void printMsg() throws InterruptedException {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("Name=" + name);
            //add sleep here - добавь sleep тут
            Thread.sleep(1);
        }
    }
}
//1. В методе printMsg присвой переменной t текущую нить.
//2. В методе printMsg после всех действий поставь задержку в 1 миллисекунду.
//Требования:
//•	Метод printMsg должен получать текущую нить с помощью Thread.currentThread.
//•	Метод printMsg должен должен усыплять нить на 1 миллисекунду.
//•	Метод printMsg должен вызывать метод getName у текущей нити.
//•	Метод main должен вызвать метод printMsg у объекта типа ThreadNamePrinter 5 раз.
//•	Метод run должен вызвать метод printMsg 5 раз.
//•	Метод printMsg у объекта типа ThreadNamePrinter суммарно должен быть вызван 10 раз.