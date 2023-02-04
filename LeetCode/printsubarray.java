public class printsubarray{
    
    public static void printwith(int[] myarray){
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int[] prefix = new int[myarray.length];
        // calculate prefix
        prefix[0] = myarray[0];
        for(int i = 1;i<myarray.length;i++){
            prefix[i] = prefix[i-1] + myarray[i];
        }

        for(int i = 0;i<myarray.length;i++){
            for(int j = i; j<myarray.length;j++){
                sum = i== 0 ? prefix[0]: prefix[j] - prefix[i-1];
                if(maxsum<sum){
                    maxsum = sum;
                }
            }

        }
        System.out.println("Max is "+maxsum);
    }

    public static void printit(int[] myarray){

        int maxsum = Integer.MIN_VALUE;
        int sum  = 0;
        for(int i =0; i<myarray.length;i++){
        for(int j = i; j<myarray.length; j++){
            for(int k = i; k<=j; k++){
                sum+=myarray[k];
            }
            if(maxsum < sum){
                maxsum = sum;
            }
        }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int[] myarray = {-2,1,-3,4,-1,2,1,-5,4};
       // printit(myarray);
       printwith(myarray);

    }
}