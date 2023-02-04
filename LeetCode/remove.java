public class remove{
    public static int removeElement(int[] nums, int val) {
        int counterVal = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i - counterVal] = nums[i];
            if (nums[i] == val)
                counterVal++;
        }
        return nums.length - counterVal;
    }

    public static void printArray(int list[]){
        for(int i =0;i<list.length;i++){
            System.out.print(list[i]);
        }
    }
    public static void main(String args[]){
        int[] list = new int[]{3,2,2,3};
        System.out.println(removeElement(list,3));
        printArray(list);

    }
}