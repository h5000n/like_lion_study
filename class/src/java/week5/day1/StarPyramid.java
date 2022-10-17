package week5.day1;

public class StarPyramid {
    String oneChar;
    public StarPyramid(){

    }
    public StarPyramid(String oneChar){
        this.oneChar = oneChar;
    }

    void printPyramid(int num){
        for(int i = 0; i < num; i++){
            for(int j = i; j< num-1; j++)
            {
                System.out.printf(" ");
            }
            for(int k = 0; k < 2*i+1 ; k++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StarPyramid pyramid = new StarPyramid("*");
        pyramid.printPyramid(4);
    }
}
