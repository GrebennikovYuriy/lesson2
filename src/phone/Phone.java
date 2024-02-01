package phone;

public class Phone {
    public String number;
    public String model;
    public int weight;

    public Phone (){

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public String name;
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
