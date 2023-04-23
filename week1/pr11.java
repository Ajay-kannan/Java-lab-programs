import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("even number");
        else
            System.out.println("odd number");

        input.close();

    }
}
