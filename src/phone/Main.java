package phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.setName("Ivan");
        phone1.setNumber("7777");
        phone1.setModel("samsung");
        phone1.setWeight(5);
        phone2.setName("Richy");
        phone2.setNumber("8888");
        phone2.setModel("nokia");
        phone2.setWeight(9);
        phone3.setName("Jim");
        phone3.setNumber("9999");
        phone3.setModel("motorola");
        phone3.setWeight(8);
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println("Звонит");
        System.out.println(phone1.getName());


    }
}
