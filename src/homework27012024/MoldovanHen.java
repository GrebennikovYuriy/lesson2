package homework27012024;

public class MoldovanHen extends Hen {

    public int getCountOfEggsPerMonth(){
        return 30;
    }
    public MoldovanHen(){

    }
    @Override
    public String toString(){
        return "MoldovianHen{}";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Молдовия. Я несу" + getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
