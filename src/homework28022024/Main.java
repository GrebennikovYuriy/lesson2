package homework28022024;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

import static java.util.logging.Level.INFO;

public class Main extends Thread{
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {


        Stream2 stream2 = new Stream2();
        stream2.setName("- я Поток Ричард");

        Stream1 stream1 = new Stream1();
        stream1.setName("- я Поток Вася");

        stream2.start();
        stream1.start();

        while (stream2.isAlive()){

        }
//        Handler fileHandler = new FileHandler();
//        LOGGER.addHandler(fileHandler);
        LOGGER.error(stream1);
        LOGGER.error(stream2);
//        LOGGER.log(org.apache.log4j.Level.WARN,"info");





    }



}
