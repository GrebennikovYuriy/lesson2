package lesson7;

public class Student {
    /**
     * 1 - переменные / поля класса / свойства / характеристики
     */
    private int age;
    private String fullName;
    private String address;
    private String phoneNumber;

    /**
     * Установка возраста
     *
     * @param age целое число, которое нужно задать как возраст
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Получить возраст
     *
     * @return значение поля age
     */
    public int getAge() {
        return age;
    }



    }
