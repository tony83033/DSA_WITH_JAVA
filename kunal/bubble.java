import java.util.*;
public class bubble{
    public static void main(String args[]){
        int[] arr = {2,1,3,5,4};
        sort(arr);
        System.out.print(Arrays.toString(arr));

    }

    static void sort(int arr[]){
        for(int i = 0; i<arr.length;i++){
            for(int j = 1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}