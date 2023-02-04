public class subarray{
    public static void find(int[] myarray){
        int sum = 0;
        for(int i = 0; i<myarray.length;i++){
            for(int j = i+1; j<myarray.length;j++){
                int tempsum = 0;
                 tempsum = tempsum+myarray[i]+myarray[j];
                if(tempsum > sum){
                    sum = tempsum;
                }
                System.out.println(tempsum);
            }
        }
        System.out.println("=============================");
        System.out.print(sum);
    }
    public static void main(String args[]){
        int[] myarray = {-2,1,-3,4,-1,2,1,-5,4};
        find(myarray);

    }
}