import java.util.ArrayList;
public class max{
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(45);
        list.add(434);
        list.add(3);
        for(int i = 0; i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }

        System.out.print(max);

    }
}