public class App {
    public static void main(String[] args) {
        /*for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 4; y++) {
                System.out.print(x);
            }

            System.out.println();
        }*/

        /*for (int num = 1; num <= 5; num++) {
            for (int count = 1; count <= num; count++) {
                System.out.print(num);
            }

            System.out.println();
        } */

        /*for (int num = 1; num <= 5; num++) {
            for (int dot = 5 - num; dot > 0; dot--) {
                System.out.print(".");

            }

            for (int count = num; count > 0; count--) {
                System.out.print(num);
            }

            System.out.println();
        } */

        /*for (int num = 1; num <= 5; num++) {
            for (int dot1 = 5 - num; dot1 > 0; dot1--) {
                System.out.print(".");
            }

            System.out.print(num);

            for (int dot2 = num - 1; dot2 > 0; dot2--) {
                System.out.print(".");
            }

            System.out.println();
        } */

        for (int big_num = 1; big_num < 19; big_num++) {
            for (int space = 9 - (big_num % 10); space > 0 && big_num < 10; space--) {
                System.out.print(" ");
            }

            for (int time1 = (big_num % 10) * 2; time1 > 0 && big_num < 10; time1--) {
                System.out.print(big_num % 10);
            }

            for (int space2 = (big_num % 10); space2 > 0 && big_num > 10; space2--) {
                System.out.print(" ");
            }

            for (int time2 = Math.abs(((big_num - ((big_num % 10) * 2)) - 1) * 2); time2 > 0 && big_num > 10; time2--) {
                System.out.print(big_num - ((big_num % 10) * 2) - 1);
            }

            if (big_num != 10) {
                System.out.println();
            }
        }
        
    }
}