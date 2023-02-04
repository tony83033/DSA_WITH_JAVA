import java.util.*;
public class selection{
  
    public static void myshort(int mylist[]){
        // 
        for(int i =0;i<mylist.length-1;i++){
            int minValue = Integer.MIN_VALUE;
            for(int j = i+1;j<mylist.length-1;j++){
                if(mylist[minValue]>mylist[j]){
                    minValue = j;
                }
            }
            int temp = mylist[minValue];
            mylist[minValue] = mylist[i];
            mylist[i] = temp;
        }
    }
      public static void myprint(int mylist[]){
        for(int i =0;i<mylist.length;i++){
            System.out.print(mylist[i]);
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
        myshort(mylist);
        myprint(mylist);
    }
}