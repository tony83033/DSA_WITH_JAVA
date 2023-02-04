import java.util.HashMap;
import java.util.*;
public class Ineration{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India",140);
        hm.put("Indonesiya",30);
        hm.put("China",34);

        Set<String> keys = hm.keySet();

        for(String k: keys){
            System.out.println(k);
        }
    }
}