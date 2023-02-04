import java.util.*;
public class subarray{
    public static void printSub(int mylist[]){
        for(int i=0; i<mylist.length; i++){
            for(int j=i; j<mylist.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(mylist[k]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array = ");
        int len = sc.nextInt();
        int mylist[] = new int[len];
        for(int i=0; i<mylist.length; i++){
            System.out.print("Enter "+(i+1)+" Element of array = ");
            mylist[i] = sc.nextInt();
        }

        printSub(mylist);

    }
}