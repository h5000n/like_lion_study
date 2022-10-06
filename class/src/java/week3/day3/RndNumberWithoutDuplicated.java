package week3.day3;

import java.util.HashSet;
import java.util.Random;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        RandomAlphabetGenerator randomAlphabetGenerator= new RandomAlphabetGenerator();
        HashSet<Integer> numbers = new HashSet<>();
        HashSet<Character> alphabets = new HashSet<>();
        char ch;
        for (int i = 0; i < 50; i++){
            int r = (randomNumberGenerator.generate(10));
            int c = randomAlphabetGenerator.generate(26);
            numbers.add(r);
            ch = (char) c;
            alphabets.add(ch);

        }
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println(alphabets);
        System.out.println(alphabets.size());
    }
}
