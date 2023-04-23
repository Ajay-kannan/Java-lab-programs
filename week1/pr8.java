import java.util.Scanner;
import java.lang.Math;

public class pr8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer : ");
        int x = input.nextInt();
        System.out.println("Enter the second integer");
        int y = input.nextInt();
        System.out.println("Enter the third integer");
        int z = input.nextInt();
        int sum = x + y + z;
        int product = x * y * z;
        int avg = Math.max(Math.max(x, y), z);
        System.out.println("sum : " + sum);
        System.out.println("average : " + (sum / 3));
        System.out.println("product : " + product);
        System.out.println("largest : " + avg);
        input.close();
    }
}
