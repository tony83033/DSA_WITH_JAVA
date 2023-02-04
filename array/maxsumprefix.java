import java.util.*;
public class  maxsumprefix{
    public static void sumPrifix(int mylist[]){
       int prefix[] = new int[mylist.length];
       prefix[0] = mylist[0];
       int currSum =0;
       int maxSum = Integer.MIN_VALUE;

       for(int i=1;i<mylist.length;i++){
            prefix[i] =  prefix[i-1] + mylist[i];
       }

       for(int i = 0;i<prefix.length;i++){
            for(int j =i; j<prefix.length;j++){
                currSum =  i==0? prefix[j]: prefix[j] - prefix[i-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                    currSum =0;
                }
            }
       }

       System.out.print("Max sum is "+maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array = ");
        int len = sc.nextInt();

        int mylist[] = new int[len];
        for(int i=0;i<mylist.length;i++){
            System.out.print("Enter "+(i+1)+" Element of array = ");
            mylist[i] = sc.nextInt();
        }

        sumPrifix(mylist);


    }
}