import java.util.*;
public class toupper{
    public static void convert(String str){
        StringBuilder nstr = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        nstr.append(ch);
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                nstr.append(str.charAt(i));
                i++;
                nstr.append(Character.toUpperCase(str.charAt(i)));
            }else{
                nstr.append(str.charAt(i));
            }
        }
        System.out.print(nstr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any thing = ");
        String str = sc.nextLine();
        convert(str);

    }
}