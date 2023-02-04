import java.util.*;
public class first{
    public static boolean search(int matrix[][],int key){
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.print("key is found in "+(i)+" "+(j)+ " Index");
                    return true;
                }
            }
        }
        System.out.print("Sorry ! key not found in matrix");
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[3][3];
        int n =matrix.length , m = matrix[0].length;
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter Element of row "+(i+1)+" and column "+(j+1)+" =  ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output 
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("Enter the key you want to find in the Index");
        int key = sc.nextInt();
        search(matrix,key);
    }
}