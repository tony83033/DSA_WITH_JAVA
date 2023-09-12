class mergeShort{
    public static void tackInput(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.println("Enter "+i+"Element ");
        }
    }
    public static void mergeShort(int arr[], int si, int ei){
        if(si>ei){
            // base case
            return;
        }
        int mid = (si+ei)/2;

        mergeShort(arr,si,mid);
        mergeShort(arr,mid+1,ei)
        
        mergeIt(arr,si,ei,mid);
    }

    public static void mergeIt(int arr[],int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int c = 0;

        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                temp[c++]=arr[j++];
                
            }else{
                temp[c++]=arr[i++];
              
            }
        }

        while(i<=mid){
            temp[c++] = arr[i++];
        }

        for(int k = 0; k<temp.length;k++){
            arr[k] = temp[k];
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array");
        n=sc.nextInt();
        int arr[] = new int[n]
        tackInput(arr);
        printArray(arr)
        mergeShort(arr,0,arr.length-1);
        printArray(arr);


    }
}