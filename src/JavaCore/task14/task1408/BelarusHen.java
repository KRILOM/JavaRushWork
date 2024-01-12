package JavaCore.task14.task1408;

public class BelarusHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 10;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - "
                + Country.BELARUS + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}