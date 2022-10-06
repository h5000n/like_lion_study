package week3.day3;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files) {
            System.out.println(file);
        }

    }
}
