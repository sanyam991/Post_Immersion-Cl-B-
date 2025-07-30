public class PseudoCode5 {

        public static int funn(int a, int b) {
            int c;

            for (c = 2; c <= 4; c++) {
                if ((a % 2) < (b % 3)) {
                    a = 4 % 3;  // always 1
                } else {
                    if ((5 % 3) > b) {  // 2 > b
                        a = b;
                    }
                    b = 1;
                }
            }

            return a + b;
        }

        public static void main(String[] args) {
            int result = funn(5, 2);  // try any values
            System.out.println("Result: " + result);
        }
    }
