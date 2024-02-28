package homework28022024;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.ChangedCharSetException;

public class Stream1 extends Thread {
    private boolean isNeedStop = false;

    @Override
    public void run() {
        int counter = 0;
        while (!isNeedStop) {
            for (int i = 1; i <= 10; i++){
                if (i % 2 != 0)
                {
                    System.out.println(i + getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
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
                counter++;
                if (counter == 1) {
                    isNeedStop = true;
                }
            }
        }
    }
}
