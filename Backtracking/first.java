public class first{

    public static void backtr(int arr[], int i, int val){
        if(i==arr.length){
            printarr(arr);
            return;
        }
        arr[i] = val; // storing value
        backtr(arr, i+1, val+1); // racursion
        arr[i] = arr[i]-2; // backtracking
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
           
        }               
         System.out.println();
    }
    public static void main(String args[]){
        int[] arr = new int[5]; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array");
        int a = sc.nextInt();
        backtr(arr,0,1);
        printarr(arr);

    }

}