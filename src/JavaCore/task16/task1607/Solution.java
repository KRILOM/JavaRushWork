package JavaCore.task16.task1607;

import java.util.ArrayList;
import java.util.List;

/*
Horse Racing
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        //1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
//2. Если лошадь еще не пришла к финишу (!isFinished()), то:
//2.1. Вывести в консоль "Waiting for " + horse.getName().
//2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
//2.3. Не считать такую лошадь финишировавшей.

        int finishedCount = 0;
        //напишите тут ваш код
        //Horse horse = new Horse(" " + finishedCount);
//        while (horses.get(finishedCount).isFinished()){
//            finishedCount++;
//            if(!horses.get(finishedCount).isFinished()){
//                System.out.println("Waiting for " + horses.get(finishedCount).getName());
//                horses.get(finishedCount).join();
//                //finishedCount--;
//            }
//        }
        for(Horse horse: horses){
            if(!horse.isFinished()){
                System.out.println("Waiting for " + horse.getName());
                horse.join();
            }
            else{
                finishedCount++;
            }
        }



        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        System.out.println("All horses start the race!");
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}

class Horse extends Thread {

    private boolean isFinished;

    public Horse(String name) {
        super(name);
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void run() {
        String s = "";
        for (int i = 0; i < 1001; i++) {   // Delay
            s += "" + i;
            if (i == 1000) {
                s = " has finished the race!";
                System.out.println(getName() + s);
                isFinished = true;
            }
        }
    }
}
//Разберись, что делает программа.
//Реализуй метод calculateHorsesFinished.
//Он должен:
//1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
//2. Если лошадь еще не пришла к финишу (!isFinished()), то:
//2.1. Вывести в консоль "Waiting for " + horse.getName().
//2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
//2.3. Не считать такую лошадь финишировавшей.
//Требования:
//
//    •
//    Метод calculateHorsesFinished должен вернуть количество финишировавших лошадей.
//    •
//    Метод calculateHorsesFinished должен вызывать метод isFinished у каждой лошади из переданного списка.
//    •
//    Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен вывести в консоль "Waiting for " + horse.getName(). Пример сообщения для первой лошади: "Waiting for Horse_01".
//    •
//    Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен подождать пока она финиширует. Используй правильный метод для ожидания.
//    •
//    После завершения работы программы, консоль должна содержать информацию о том, что все лошади финишировали. Пример сообщения для первой лошади: "Horse_01 has finished the race!".