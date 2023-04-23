import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer : ");
        int x = input.nextInt();
        System.out.println("Enter the second integer");
        int y = input.nextInt();
        System.out.println("Enter the third integer");
        int z = input.nextInt();
        int result = x * y * z;
        System.out.println("Product is " + result);

        input.close();
    }
}
