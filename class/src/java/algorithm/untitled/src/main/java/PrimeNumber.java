public class PrimeNumber {
    public static boolean solution(int n){
        int cnt = 0;
        if(n==1) return false;
        if(n==2) return true;
        if(n==3) return true;
        for(int i = 2; i <n; i++){
            if(n % i ==0){
                cnt+=1;
            }
        }
        if(cnt==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(solution(17));
    }
}
