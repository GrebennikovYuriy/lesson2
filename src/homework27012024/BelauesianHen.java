package homework27012024;

import java.util.Objects;

public class BelauesianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    public BelauesianHen() {

    }

    @Override
    public String toString() {
        return "BelauesianHen{}";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Беларуссия. Я несу" + getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
