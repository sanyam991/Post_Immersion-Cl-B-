package Friday_1AUG;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.print(sumofdigits(n));
    }
    public static int sumofdigits(int n){
        //n=451

        if(n<10){
            return n;
        }
        return (n%10)+sumofdigits(n/10);

    }

}
