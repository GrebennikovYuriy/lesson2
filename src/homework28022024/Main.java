package homework28022024;

public class Main extends Thread{
    public static void main(String[] args) {


        Stream2 stream2 = new Stream2();
        stream2.setName("- я Поток Ричард");

        Stream1 stream1 = new Stream1();
        stream1.setName("- я Поток Вася");

        stream2.start();
        stream1.start();

        while (stream2.isAlive()){

        }



    }

}
