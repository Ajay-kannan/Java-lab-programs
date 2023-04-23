import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = input.nextInt();
        System.out.println("enter the second number :");
        int b = input.nextInt();
        System.out.println("sum : " + (a + b));
        System.out.println("product : " + (a * b));
        System.out.println("difference : " + (a - b));
        System.out.println("quotient : " + (a / b));

        input.close();
    }
}
