import java.util.HashMap;
public class intro{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India",140);
        hm.put("Indonesiya",20);
        hm.put("China",40);
        hm.put("Japan",39);

        System.out.println(hm.get("India"));
        System.out.println(hm);
        System.out.println(hm.get("U.s"));
        System.out.println(hm.containsKey("India"));
    }
}