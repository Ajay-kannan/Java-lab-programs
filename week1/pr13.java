public class pr13 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i % 2 == 0 && j % 2 != 0)
                    System.out.print("* ");
                if (j % 2 == 0 && i % 2 != 0)
                    System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
