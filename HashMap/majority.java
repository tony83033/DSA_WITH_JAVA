import java.util.*;
public class majority{
    public static void main(String args[]){
        int[] arr = {1,2,3,45,1,2,34,1,2,1,1,1};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                  //containsKey
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }

       // System.out.print(hm);

       Set<Integer> keys = hm.keySet();
       for(int k: keys){
            if(hm.get(k)> arr.length/3){
                System.out.print(k);
            }
       }
    }
}