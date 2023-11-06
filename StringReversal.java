import java.lang.StringBuffer;
import java.lang.String;
public class StringReversal {

    public static void main(String[] args) {
        
        // StringBuffer s = new StringBuffer("Pranav");

        // s.reverse();

        // // Mirror Image
        // System.out.println("Pranav"+" | "+s);

        String str1 = new String();

        str1 = "Pranav";

        String str2 = new String();

        str2 = "";

        int x = str1.length()-1;

        while(x>=0){
            str2 = str2 + str1.charAt(x);
            x--;
        }

        System.out.println(str1+" | "+str2);
        
        // using string builder we can append and cant use concatenate.
    }
    
}
