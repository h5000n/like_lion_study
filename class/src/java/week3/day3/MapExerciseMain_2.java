package week3.day3;

import java.util.HashMap;

public class MapExerciseMain_2 {
    static boolean isAlphabet(Character c){
        if((c >= 'a' && c <= 'z') || (c>='A' && c<= 'Z')){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String repoAddr = "https://github.com/dongyeon-0822/java-project-exercise";
        HashMap<Character, Integer> cntMap= new HashMap<>();
        char ch;
        String s;
        for(int i = 0; i < 26; i++){
            cntMap.put((char)(97+i),0);
        }
        for(int i = 0; i < repoAddr.length(); i++){
            ch = repoAddr.charAt(i);
            if(isAlphabet(ch))
                cntMap.put(ch, cntMap.get(ch)+1);
        }
        for(int i = 0; i < 26; i++){
            System.out.println(cntMap.get((char)(97+i)));
        }
    }
}
