package week3.day3;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num){
        int result = (int) (Math.random()*num);
        return result;
    }
}
