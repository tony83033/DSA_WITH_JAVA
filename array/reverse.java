import java.util.*;
public class reverse{
    public static void reverse(int mylist[]){
        int first =0,last = mylist.length-1;
        while(first<last){
            int temp = 0;
            temp = mylist[last];
            mylist[last] = mylist[first];
            mylist[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array");
        int len = sc.nextInt();
        int mylist[] = new int[len];
        for(int i=0; i<mylist.length;i++){
            System.out.print("Enter "+(i+1)+" Element of array = ");
            mylist[i] = sc.nextInt();
        }
        reverse(mylist);
        for(int i = 0;i<=mylist.length;i++){
            System.out.println(mylist[i]);
        }

        

    }
}