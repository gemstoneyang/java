package e.io.practice;

import java.io.*;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "/workspace/java";
        long sum = sample.printFileSize(path);
        System.out.println(path+"'s total size="+sum);
    }
    public long printFileSize(String dirName) {
        File dir = new File(dirName);
        long sum = 0;
        if(dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            for(File file : fileList) {
                if(file.isFile()) {
                    String tempFileName = file.getAbsolutePath();
                    long fileLength = file.getUsableSpace();
                    System.out.println(tempFileName+"="+convertFileLength(fileLength));
                    sum += fileLength;
                } else {
                    String tempDirName = file.getAbsolutePath();
                    long fileLength = printFileSize(tempDirName);
                    System.out.println("["+tempDirName+"]="+convertFileLength(fileLength));
                    sum += fileLength;
                }
            }
        }
        return sum;
    }
    private String convertFileLength(long fileLength) {
        double res;
        if (fileLength <= 1024) {
            return fileLength+" b";
        } else if (fileLength <= 1024*1024) {
            res = 1.0 * fileLength/1024;
            return res+" kb";
        } else if (fileLength <= 1024*1024*1024) {
            res = 1.0 * fileLength/(1024*1024);
            return res+" mb";
        } else {
            res = 1.0 * fileLength/(1024*1024*1024);
            return res+" gb";
        }        
    }
}
