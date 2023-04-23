import java.util.Scanner;

public class pr12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = input.nextInt();
        System.out.println("enter the second number");
        int num2 = input.nextInt();
        if (num2 % num1 == 0) {
            System.out.println("first is multiple of second");
        } else {
            System.out.println("first is not multiple of second number");
        }
        input.close();
    }

}
