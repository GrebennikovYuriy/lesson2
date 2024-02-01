package homework27012024;

public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 60;
    }
    public UkrainianHen(){

    }
    @Override
    public String toString(){
        return "UkrainianHen{}";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Украина. Я несу" + getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
