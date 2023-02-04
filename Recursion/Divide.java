import java.util.*;
public class Divide{
    public static void printArr(int myarr[]){
        for(int i=0;i<myarr.length;i++){
            System.out.print(myarr[i]);
        }
        System.out.println();
    }

    public static void mergeSort(int myarr[], int si, int ei){
        
        if(si>=ei){
            return; // base case
        }
        //kaam
        int mid = si+ei/2;
        mergeSort(myarr,si,mid);// left
        mergeSort(myarr,mid+1,ei); // right

        merge(myarr, si,ei,mid);
    }

    public static void merge(int myarr[], int si, int ei , int mid){
        // kaam
        int[] temp = new int[ei-si+1];
        int i = si; // idx for first short part
        int j = ei; // idx for second short part
        int k = 0; // idx for temp

        while(i<=mid && j<=ei){
            if(myarr[i]<myarr[j]){
                temp[k] = myarr[i];
                i++;
            }else{
                temp[k] = myarr[j];
                j++;
            }
            k++;

        }

        // for leftover element for first shorted part
        while(i<=mid){
            temp[k++] = myarr[i++];
        }

        // for leftover element for second shorted part
        while(j<=ei){
            temp[k++] = myarr[j++];
        }

        // copy element from temp to main array
        for(int h = 0, l=si; h<temp.length;h++, l++){
            myarr[l] = temp[h];
        }
    }
    public static void main(String args[]){
        int[] myarr = {34,343,53,34,3};
        mergeSort(myarr,0, myarr.length-1);
        printArr(myarr);
    }
}