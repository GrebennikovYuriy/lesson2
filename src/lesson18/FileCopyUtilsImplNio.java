package lesson18;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyUtilsImplNio implements FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File destinationFile = new File(destination);
        if (destinationFile.exists()){
            throw new FileAlreadyExistsException("Файл уже существует: " + destination);

    }
        Path copied = Paths.get(destination);
        Path originalPath = Paths.get(source);
try {
    Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);

    }
        catch (IOException e) {
       throw new FileCopyFailedException(e.getMessage());
    }
}

}
