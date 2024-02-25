package lesson18;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileCopyUtilsImpCommonsIo implements FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File destinationFile = new File(destination);
        if (destinationFile.exists()){
            throw new FileAlreadyExistsException("Файл уже существует: " + destination);

    }
        File copied = new File(destination);
        File original = new File(source);
try {
    FileUtils.copyFile(original, copied);

    }
        catch (IOException e) {
       throw new FileCopyFailedException(e.getMessage());
    }
}

}
