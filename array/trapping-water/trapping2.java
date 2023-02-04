import java.util.*;
public class trapping2{
    public static int water(int bars[]){
        // calculate left max and store in a array
        int n = bars.length;
        int trappedWater = 0;
        int leftMax[] = new int[n];
        leftMax[0] = bars[0];
        for(int i =1;i<n;i++){
            leftMax[i] = Math.max(bars[i],leftMax[i-1]);
        }
        // calculate right max and stor in a array
        int rightMax[] = new int[n];
        rightMax[n-1] = bars[n-1];
        for(int i =n-2;i>=0;i--){
            rightMax[i] = Math.max(bars[i],rightMax[i+1]);
        }
        // calculate water level
        for(int i=0;i<n;i++){
            int waterLevar = Math.min(leftMax[i],rightMax[i]);
        // calculate trapped water
            trappedWater += (waterLevar - bars[i]);
        }

        for(int i = 0; i<leftMax.length;i++){
            System.out.print(leftMax[i]);
        }
        System.out.println();
         for(int i = 0; i<leftMax.length;i++){
            System.out.print(rightMax[i]);
        }
         System.out.println();


        return trappedWater;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of bar = ");
        int num = sc.nextInt();
        int bars[] = new int[num];
        for(int i =0;i<bars.length;i++){
            System.out.print("Enter "+(i+1)+" Element of array = ");
            bars[i] = sc.nextInt();
        }

        System.out.print(water(bars));
    }
}