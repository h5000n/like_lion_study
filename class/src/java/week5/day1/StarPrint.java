package week5.day1;

import java.util.Scanner;

public class StarPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
