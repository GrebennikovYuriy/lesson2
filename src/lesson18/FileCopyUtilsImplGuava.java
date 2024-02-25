package lesson18;

import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyUtilsImplGuava implements FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File destinationFile = new File(destination);
        if (destinationFile.exists()){
            throw new FileAlreadyExistsException("Файл уже существует: " + destination);

    }
        File copied = new File(destination);
        File original = new File(source);
try {
    Files.copy(original, copied);

    }
        catch (IOException e) {
       throw new FileCopyFailedException(e.getMessage());
    }
}

}
