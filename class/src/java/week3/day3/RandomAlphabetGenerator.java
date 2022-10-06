package week3.day3;

public class RandomAlphabetGenerator implements NumberGenerator {
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num)+65;
    }
}
// 90 - 65 + 1     / + 65
