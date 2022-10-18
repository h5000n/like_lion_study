package week5.day2;

public class StarSquare {
    String oneChar;
    void printSuqare(String oneChar, int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.printf("%s",oneChar);
            }
            System.out.println();
        }
    }
    void printRectangle(String oneChar, int width, int height){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.printf("%s",oneChar);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StarSquare square = new StarSquare();
        square.printSuqare("*",4);
        square.printRectangle("*",4,3);

    }
}
