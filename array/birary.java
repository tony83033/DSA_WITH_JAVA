import java.util.*;
public class binary {
    public static int search(int mylist[], int key){
        int start = 0, end = mylist.length-1;;
        while(start<=end){
            int mid = (start+end)/2; // Find min
            if(mylist[mid]==key){
                return mid; // key Found
            }
            if(mylist[mid]<key){ //  Find in Right update start
                    start = mid+1;
            }else{
                end = mid-1;  // Find in left update end
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter length of array ");
        int len = sc.nextInt();
        int mylist[] = new int[len];

        for(int i = 0; i<mylist.length;i++){
            System.out.print("Enter "+(i+1)+" Element of array ");
            mylist[i] = sc.nextInt();

        }

        System.out.print("Enter the key you want to find in array ");
        int key = sc.nextInt();

        int result = search(mylist,key);

        if(result==-1){
            System.out.print("Not Found");
        }else{
            System.out.print("Key found in "+result);
        }
    }
}