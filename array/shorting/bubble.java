import java.util.*;
public class bubble{
    public static void myshort(int myarray[]){
        for(int i =0;i<myarray.length-1;i++){
            for(int j = 0;j<myarray.length-1-i;j++){
                    if(myarray[j]>myarray[j+1]){
                        int temp = myarray[j];
                        myarray[j] = myarray[j+1];
                        myarray[j+1] = temp;
                    }
            }
        }
        for(int i =0;i<myarray.length;i++){
            System.out.print(myarray[i]);
        }

        
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array = ");
        int len = sc.nextInt();
        int myarray[] = new int[len];
        for(int i =0;i<myarray.length;i++){
            System.out.print("Enter "+(i+1)+" Element of array");
            myarray[i] = sc.nextInt();
        }
        myshort(myarray);
    }
}