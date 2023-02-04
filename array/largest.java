import java.util.*;
public class largest{
    public static int findLargest(int myarry[]){
        int largestnum = Integer.MIN_VALUE;
        for(int i =0;i<myarry.length;i++){
            if(largestnum < myarry[i]){
                largestnum = myarry[i];
            }
        }
        return largestnum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array = ");
        int len = sc.nextInt();
       
        int myarry[] = new int[len];

        for(int i =0;i<myarry.length;i++){
            System.out.print("Enter "+(i+1)+"Element of array = ");
            myarry[i] = sc.nextInt();
        }

        int largestnum = findLargest(myarry);
        System.out.print("Largest number in this array is = "+largestnum);


    }
}