package homework8;

public class Q15LeftTriangle {

    public static void main(String[] args) {


        int x;
        int y;
        int z = 5;

        // 1st loop
        for (x = 0; x < z; x++) {

            for (y = 1 * (z - x); y >= 0; y--) {
                // printing spaces
                System.out.print(" ");
            }
            // nested 3rd loop
            for (y = 0; y <= x; y++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }
}