package lesson18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka.avi"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka111.avi"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
           e.printStackTrace();
        }
    }
}