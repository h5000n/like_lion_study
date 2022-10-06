package week3.day3;

public class AlphabetCnt {
    static boolean isAlphabet(Character c){
        if((c >= 'a' && c <= 'z') || (c>='A' && c<= 'Z')){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        String s1= "1122aabbccddeeffgghhiijkkkkkkkllm";
        char ch;
        for(int i = 0; i < s1.length(); i++){
            System.out.println(s1.charAt(i));
            ch = s1.charAt(i);
            System.out.println(isAlphabet(ch));

        }
    }
}
