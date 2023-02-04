import java.util.ArrayList;

public class multi{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> masterlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list1.add(2);
        list1.add(7);
        masterlist.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(2);
        list2.add(8);
        list2.add(5);
        masterlist.add(list2);
        System.out.println(masterlist);

        for(int i = 0; i<masterlist.size();i++){
            ArrayList<Integer> currList = masterlist.get(i);
            for(int j = 0; j<currList.size(); j++){
                System.out.print(currList.get(j));
            }
            System.out.println();
        }
    }
}