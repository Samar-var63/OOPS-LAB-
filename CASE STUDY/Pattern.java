public class Pattern {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int s = 8 - i; s > 1; s--) {
                System.out.print("    ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {    
                System.out.printf("%4d", num);// left
                num *= 2;
            }
            num /= 4;
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", num);//right
                num /= 2;
            }

            System.out.println();
        }

    }
}
