public class NumberSwapping {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;

        System.out.println("Before Swapping :");
        System.out.println("a: "+a+" b: "+b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping :");
        System.out.println("a: "+a+" b: "+b);

        

        
    }
}
