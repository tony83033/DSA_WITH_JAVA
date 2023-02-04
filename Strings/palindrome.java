import java.util.*;
public class palindrome{
    public static boolean check(String word){
        int n = word.length();
        for(int i =0;i<word.length()/2;i++){
            if(word.charAt(i) != word.charAt(n-i-1));
            System.out.print("Not a palindrome");
            return false;
        }
        System.out.print("The word is palindrome");
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word = ");
        String word = sc.next();

        System.out.print(check(word));

    }
}