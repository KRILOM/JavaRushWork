package JavaCore.task14.task1408;

/*
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory implements Country{

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country){
                case Country.UKRAINE: hen = new UkrainianHen();
                break;
                case Country.RUSSIA: hen = new RussianHen();
                break;
                case Country.BELARUS: hen = new BelarusHen();
                break;
                case Country.MOLDOVA: hen = new MoldovanHen();
                break;
            }
            return hen;
        }
    }
}

