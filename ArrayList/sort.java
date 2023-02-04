
import java.util.ArrayList;
import java.util.Collections;
public class sort{
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(34);
        list.add(23);
        list.add(1);
        list.add(5);

        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);
    }
}