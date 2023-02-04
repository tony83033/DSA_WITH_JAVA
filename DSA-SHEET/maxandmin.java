public class maxandmin{

    public static int findMax(int[] myarray){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<myarray.length;i++){
            int curr = myarray[i];
            max = Math.max(curr,max);
        }

        return max;
    }

    public static int findMin(int[] myarray){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<myarray.length;i++){
            int curr = myarray[i];
            min = Math.min(curr,min);
        }
        return min;
    }

    public static void main(String args[]){
        int[] myarray = {1,2,3,4,5};

        System.out.println("Max Integer is "+findMax(myarray));
        System.out.print("Min Integer is "+findMin(myarray));
    }
}