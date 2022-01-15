package e.io;

import java.io.File;
import java.io.IOException;

public class FileManageClass {
    public static void main(String[] args) {
        FileManageClass sample = new FileManageClass();
        String pathName = "/workspace/java/text";
        String fileName = "test.txt";
        
        sample.checkFile(pathName, fileName);
    }
    public void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = " + file.createNewFile());
            getFileInfo(file);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void getFileInfo(File file) throws IOException {
        System.out.println("Absolute path = "+file.getAbsolutePath());
    }
}
