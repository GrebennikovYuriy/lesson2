package homework27012024;

public class Main {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen("Беларусь"); //проявление пораждающего шаблона Factory
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.print(hen.getDescription());
    }




    }


