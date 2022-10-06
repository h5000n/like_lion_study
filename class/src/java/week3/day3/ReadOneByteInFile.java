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

    public String readNByte(String fileName,int N){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){
            String returnStr ="";
            String line;
            while((line = br.readLine()) != null) {
                for(int i = 0; i < N; i++){
                    returnStr +=  (line.charAt(i));
                }
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "e";
    }
    public static void main(String[] args) {
        ReadOneByteInFile readOneByteInFile = new ReadOneByteInFile();
        System.out.println(readOneByteInFile.readOneByte("a_file.txt"));
        System.out.println(readOneByteInFile.readNByte("a_file.txt",5));
    }

}
