package homework28022024;

public class Stream2 extends Thread{

   @Override
    public void run() {
        int counter =2;
        while (counter <= 10){
            //мы засыпаем по этому монитору
            synchronized (Monitors.STRING) {
                try {
                    Monitors.STRING.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
                        System.out.println(counter + getName());
            counter += 2;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
            //Мы будем того, кто ждет
            synchronized (Monitors.STRING) {
                Monitors.STRING.notify();
            }

        }

        }
    }

