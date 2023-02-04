import java.util.ArrayList;
public class first{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(list.get(1));
        System.out.println(list);
        //list.remove(4);
       list.set(0,23);
    //    list.add(0,20);
        System.out.print(list);
    }
}