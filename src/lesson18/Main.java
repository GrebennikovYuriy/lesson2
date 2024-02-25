package lesson18;

public class Main {
    public static void main(String[] args) throws FileCopyFailedException {
        FileCopyUtilsImplIO fileCopyUtilsImplIO = new FileCopyUtilsImplIO();
        FileCopyUtilsImplNio fileCopyUtilsImplNio = new FileCopyUtilsImplNio();
        FileCopyUtilsImplGuava fileCopyUtilsImplGuava = new FileCopyUtilsImplGuava();
        FileCopyUtilsImpCommonsIo fileCopyUtilsImpCommonsIo = new FileCopyUtilsImpCommonsIo();

        long time1 = System.currentTimeMillis();
        fileCopyUtilsImplIO.copyFile("C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka.avi", "C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka1.avi");
        long time2 = System.currentTimeMillis();
        fileCopyUtilsImplNio.copyFile("C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka.avi", "C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka2.avi");
        long time3 = System.currentTimeMillis();
        fileCopyUtilsImplGuava.copyFile("C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka.avi", "C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka3.avi");
        long time4 = System.currentTimeMillis();
        fileCopyUtilsImpCommonsIo.copyFile("C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka.avi", "C:\\Users\\user\\Desktop\\1111\\Ubit`_drakona_2.19_Olu6ka4.avi");
        long time5 = System.currentTimeMillis();


        System.out.println(time2 - time1 + " io");
        System.out.println(time3 - time2 + " nio");
        System.out.println(time4 - time3 + " guava");
        System.out.println(time5 - time4 + " commonsIo");
    }
}
