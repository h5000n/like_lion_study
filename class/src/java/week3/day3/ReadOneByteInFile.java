package week3.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadOneByteInFile {

    public char readOneByte(String fileName){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while((line = br.readLine()) != null) {
                return line.charAt(0);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 'e';
    }
    public static void main(String[] args) {
        ReadOneByteInFile readOneByteInFile = new ReadOneByteInFile();
        System.out.println(readOneByteInFile.readOneByte("a_file.txt"));
    }

}
