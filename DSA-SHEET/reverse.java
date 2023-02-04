// in this program we try to revers the give array
// example [12345]
// output should be // [54321]
// Let's code it
import java.util.*;
public class reverse{
    public static void letsReverse(int[] myarray){
        int n = myarray.length-1;
        int[] temparray = new int[myarray.length];
        for(int i = n;i>=0;i--){
            temparray[n-i] = myarray[i];
        }

        // for(int i = 0; i<temparray.length;i++){
        //     System.out.print(temparray[i]);
        // }
        System.out.print(Arrays.toString(temparray));
    }

    public static void again(int[] myarray){
        int start = 0;
        int end = myarray.length-1;

        while(start<end){
            int temp = myarray[start];
            myarray[start] = myarray[end];
            myarray[end] = temp;
            start++;
            end--;
        }

        System.out.println("Here same answer using another method");
        System.out.print(Arrays.toString(myarray));

    }
    public static void main(String args[]){
        int[] myarray = {1,2,3,4,5};
       //letsReverse(myarray);
     //System.out.print(myarray.length);

     again(myarray);
    }
}