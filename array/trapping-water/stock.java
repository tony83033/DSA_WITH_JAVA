import java.util.*;
public class stock{
    public static int profit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0; i<prices.length;i++){
            if(buyPrice< prices[i]){
                int profit = (prices[i]-buyPrice);
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of prices = ");
        int num = sc.nextInt();
        int prices[] = new int[num];
        for(int i=0;i<prices.length;i++){
            System.out.print("Enter "+(i+1)+" Element of number");
            prices[i] = sc.nextInt();
        }
        System.out.print(profit(prices));
    }
}