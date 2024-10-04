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

        for (int num = 1; num <= 5; num++) {
            for (int dot1 = 5 - num; dot1 > 0; dot1--) {
                System.out.print(".");
            }

            System.out.print(num);

            for (int dot2 = num - 1; dot2 > 0; dot2--) {
                System.out.print(".");
            }

            System.out.println();
        }
    }
}