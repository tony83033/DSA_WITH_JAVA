import java.util.*;
public class trapping{
    public static int water(int bars[]){
        // left max boundry
        int trappedWater=0;
        int n = bars.length;
        int left[] = new int[n];
        left[0] = bars[0];
        for(int i =1;i<bars.length;i++){
            left[i] = Math.max(bars[i],left[i-1]);
        }
        // right max boundry
        int right[] = new int[n];
        right[n-1] = bars[n-1];
        for(int i = bars.length-2;i>=0;i--){
            right[i] = Math.max(bars[i],right[i+1]);
        }
        // loop
        for(int i=0;i<bars.length;i++){
        // water level
        int waterLevel = Math.min(left[i],right[i]);
        // trapped water
         trappedWater += (waterLevel - bars[i]);

        }
        // adding trapped water
        return trappedWater;


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number's of bar's = ");
        int num = sc.nextInt();
        int bars[] = new int[num];
        for(int i=0;i<bars.length;i++){
            System.out.print("Enter hisght of "+(i+1)+"bar = ");
            bars[i] = sc.nextInt();
        }
        System.out.print(water(bars));


    }
}