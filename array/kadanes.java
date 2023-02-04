import java.util.*;
public class kadanes{
    public static void mykadanes(int mylist[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<mylist.length;i++){
            currSum = currSum+ mylist[i];
            if(currSum <0){
                currSum =0;
            }
             maxSum = Math.max(currSum,maxSum);
        }
        System.out.print("Max sum is "+maxSum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array");
        int len = sc.nextInt();

        int mylist[] = new int[len];

        for(int i=0;i<mylist.length;i++){
            System.out.print("Enter "+(i+1)+" Element of array");
            mylist[i] = sc.nextInt();
        }
        mykadanes(mylist);
    }
}