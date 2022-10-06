package week3.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    public void printFIles(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files) {
            System.out.println(file);
        }
    }
    public char readAChar(String fileName) throws IOException{
        FileReader fileReader = new FileReader(fileName);
        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public String readNChars(String filename, int nByte) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for(int i = 0; i < nByte; i++){
            str += (char) fileReader.read();

        }
        return str;
    }
    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("a_file.txt");
        String str = fileExercise.read2Chars("a_file.txt");
        String str2 = fileExercise.readNChars("a_file.txt",5);
        System.out.println(c);
        System.out.println(str);
        System.out.println(str2);
    }
}
