public class pr9 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 ||
                        j == 0 || j == n - 1)
                    System.out.print("*");

                else
                    System.out.print(" ");

            }
            System.out.println("");
        }

        System.out.println("\n\n");

        int radius = 5;
        // dist represents distance to the center
        double dist;

        // for horizontal movement
        for (int i = 0; i <= 2 * radius; i++) {

            // for vertical movement
            for (int j = 0; j <= 2 * radius; j++) {
                dist = Math.sqrt((i - radius) * (i - radius) +
                        (j - radius) * (j - radius));

                // dist should be in the range (radius - 0.5)
                // and (radius + 0.5) to print stars(*)
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("\n");
        }

        int size = 8;
        int mid = size / 2 + 1;
        System.out.println("\n\n");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == (size / 2) || j == mid || j == size - mid + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
            mid++;
        }
        System.out.println("\n\n");
        n = 8;

        for (int i = 1; i <= n + 1; i++) {

            // print space
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            // print digit or space
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // new line
            System.out.println();
        }

        // for second half portion
        for (int i = n; i >= 1; i--) {

            // print space
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            // print digit or space
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");

        }
    }

}
