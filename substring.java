import java.util.*;

public class substring {

    public static String sub(String str, int str_index, int end_index){
        String result = "";
        for(int i=str_index;i<end_index;i++){
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the starting index of the substring");
        int str_index = sc.nextInt();
        System.out.println("Enter the ending index of the substring");
        int end_index = sc.nextInt();
        System.out.println(sub(str, str_index, end_index));
    }
}
