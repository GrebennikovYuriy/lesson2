package homework28022024;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.ChangedCharSetException;

public class Stream1 extends Thread {


    @Override
    public void run() {
        int counter = 1;
        while (counter <=10) {
            System.out.println(counter + getName());
            counter +=2;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

            //Мы будем того, кто ждет
            synchronized (Monitors.STRING) {
                Monitors.STRING.notify();
            }
            //мы засыпаем по этому монитору
            synchronized (Monitors.STRING) {
                try {
                    Monitors.STRING.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
