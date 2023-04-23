import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = input.nextInt();
        System.out.println("enter the second number :");
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is larger then " + b);
        } else if (a == b) {
            System.out.println("these numbers are equal");
        } else {
            System.out.println(b + " is larger then " + a);
        }

        input.close();
    }
}
