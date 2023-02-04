class test {
    public static int removeDuplicates(int[] nums) {
        int nonDup = 0;
    for(int i = 1; i< nums.length;i++){
        if(nums[i] != nums[i-1]){
            nums[++nonDup] = nums[i];
        }
    }
    return ++nonDup;
    }

    public static void main(String args[]){
        int myarray[] = {1,2,3,4,5,5};
        System.out.print(removeDuplicates(myarray));
        

        for(int i = 0; i<myarray.length;i++){
            System.out.print(myarray[i]);
        }
    }
}