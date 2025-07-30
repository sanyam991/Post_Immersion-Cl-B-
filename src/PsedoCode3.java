public class PsedoCode3 {
    public static int funn(int a, int b) {
        if (a != 0 && b != 0 && (a + b) > 0) {
            return a + funn(a - 2, b - 2) + b;
        }
        return a ^ b;
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        int result = funn(a, b);
        System.out.println("Result: " + result);  // Output: 40
    }
}
