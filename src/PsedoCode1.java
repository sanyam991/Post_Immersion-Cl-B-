public class PsedoCode1 {
    public static void main(String[] args) {
        int w=40;
        int x=4;
        int y;
        y=0;
        if(x%w == 0 || w%x==0){
            y=y+1;
        }
        else{
            y=y+10;
        }
        System.out.println(y);
    }
}