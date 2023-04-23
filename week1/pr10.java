import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int max = 0, min = 9999;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the five number");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("largest is " + max);
        System.out.println("smallest is " + min);
        input.close();
    }
}
