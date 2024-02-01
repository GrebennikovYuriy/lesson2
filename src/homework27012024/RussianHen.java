package homework27012024;

public class RussianHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 50;
    }
    public RussianHen(){

    }
    @Override
    public String toString(){
        return "RussianHen{}";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Россию. Я несу" + getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
