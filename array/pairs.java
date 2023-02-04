import java.util.*;
public class pairs{
    public static void pair(int mylist[]){
        for(int i= 0;i<mylist.length;i++){
            int curr = mylist[i];
            for(int j= i+1;j<mylist.length;j++){
                System.out.print("( "+curr +", "+mylist[j]+" )");

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array");
        int len = sc.nextInt();
        int mylist[] = new int[len];

        for(int i=0;i<mylist.length;i++){
            System.out.print("Enter "+(i+1)+" Element of array = ");
            mylist[i] = sc.nextInt();
        }

        pair(mylist);


    }
}