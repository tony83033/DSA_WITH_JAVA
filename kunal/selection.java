import java.util.*;
public class selection{
    public static void main(String args[]){
        int[] arr = {2,3,1,4,5};

        for(int i = 0; i<arr.length;i++){
            int last = arr.length - i -1;
            int mymax = getMax(arr,0,last);
            swap(arr,mymax,last);

        }

        System.out.print(Arrays.toString(arr));
       // System.out.print(Arrays.toString(arr));
    }
    

    static void swap(int arr[], int max, int last){
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }
    static int getMax(int arr[],int start, int end){
        int max = start;
        for(int i = 0; i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}