package Friday_1AUG;

public class Execise3 {
    public static int function(int x, int y){
        if(y==0||y==x){
            return  1;
        }
        return function(x-1,y)+function(x-1,y-1);
    }

    public static void main(String[] args) {
        int x=10,y=0;
        System.out.println(function(x,y));
    }
}
