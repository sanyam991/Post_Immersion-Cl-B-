package Friday_1AUG;

public class Exercise1 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(recursive(n));
    }
    public static int recursive(int n){
        if(n<=1){
            return n;
        }
        if(n%2==0){
            return n+recursive(n/2);
        }
        return recursive((n+1)/2)+recursive((n-1)/2);
    }
}
