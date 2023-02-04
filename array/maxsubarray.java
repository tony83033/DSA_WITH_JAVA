import java.util.*;
public class maxsubarray{
    public static void maxSubArrary(int mylist[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<mylist.length;i++){
            for(int j =i; j<mylist.length;j++){
                
                for(int k = i; k<=j;k++){
                    
                    currSum += mylist[k];
                   
                }
                 System.out.print(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                    currSum = 0;
                }else{
                    currSum = 0;
                }
            }
            System.out.println();
        }
        System.out.print("Max sum is "+maxSum);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array");
        int len = sc.nextInt();
        int mylist[] = new int[len];

        for(int i =0;i<mylist.length;i++){
            System.out.print("Enter "+(i+1)+" Elenment of array");
             mylist[i] = sc.nextInt();
        }

        maxSubArrary(mylist);
    }
}