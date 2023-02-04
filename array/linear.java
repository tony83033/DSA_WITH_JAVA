import java.util.*;
public class linear{
    public static int linearSearch(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subject");
        int n = sc.nextInt();
        int marks[] = new int[n];

        for(int i =0;i<marks.length;i++){
            System.out.print("Enter number of "+(i+1)+" Subject ");
            marks[i] = sc.nextInt();
        }

        System.out.print("Enter key you want to find ");
        int k = sc.nextInt();

        int index = linearSearch(marks,k);

        if(index == -1){
            System.out.print("Not foundn");
        }else{
            System.out.print("Index of key is "+index+1);
        }



    }
}