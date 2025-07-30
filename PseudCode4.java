public class PseudCode4 {
        public static void main(String[] args) {
            int a = 3, b = 3;
            a = b;

            if ((1 ^ 1) != 0) {
                a = 1;
            } else {
                b = 2;
            }

            System.out.println("a + b = " + (a + b));  // Output: a + b = 5
        }
    }
