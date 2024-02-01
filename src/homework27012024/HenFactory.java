package homework27012024;

public abstract class HenFactory {
   public static Hen getHen (String country){
       String countryLowerCase = country.toLowerCase();
       if ("россия".equals(countryLowerCase)) {
           return new RussianHen();
       } else if ("украина".equals(countryLowerCase)) {
           return new UkrainianHen();
       } else if ("Молдовский".equals(countryLowerCase)) {
           return new BelauesianHen();
       } else if ("Беларусь".equals(countryLowerCase)) {
           return new BelauesianHen();
       } else {
           return new RussianHen();
       }
   }

}
