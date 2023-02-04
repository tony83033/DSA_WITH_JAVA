import java.util.ArrayList;
public class pairsum{
    public static boolean find(ArrayList<Integer> list , int target){
        for(int i =0; i<list.size();i++){
            for(int j = 0; j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }

            }
           
        }
         return false;
    }

    // 2 two pointer approach
    public static boolean twopoint(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //System.out.print(find(list,1));
        System.out.print(twopoint(list,10));
    }
}