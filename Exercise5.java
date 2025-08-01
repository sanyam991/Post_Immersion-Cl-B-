package Friday_1AUG;

import java.util.Scanner;

public class Exercise5 {
    public static void print(int n){

        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
        print(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
