package week5.day1;

import java.util.Scanner;

public class StarPrint {
    String oneChar;
    public StarPrint(String oneChar){
        this.oneChar = oneChar;
    }
    void print(int num){
        for(int i = 0;i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf(this.oneChar);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StarPrint pt = new StarPrint("#");
        pt.print(num);
    }
}
