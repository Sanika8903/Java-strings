package strings;
import java.util.*;

public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }

        if(result == false) System.out.println("Not a palindrome");
        else{
            System.out.println("Palindrome");
        }
    }
}
