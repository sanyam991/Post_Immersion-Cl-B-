package Friday_1AUG;

public class Exercise4 {
    public static int g(int x, int y){
        if(x==y)  return  x*y;
        return g(x,(x+y)/2)+g((x+y)/2+1,y);
    }

    public static void main(String[] args) {
        int x=2, y=7;
        System.out.println(g(x,y));
    }
}
