import java.util.*;

public class ExceptionHandlingArray {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int x;
            x = sc.nextInt();
            arr[i] = x;
        }

        try {
            int x = arr[-1];
            System.out.println(x);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("You tried to access index which is out of bound");
        }
        finally {
            System.out.print("Your Array is: ");
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
        }

    }
}
