public class grid{
    public static int findgrid(int martix[][],int x, int y, int n, int m){
        if(x == n-1 && y==m-1){
            return 1;
        }else if(x==n || y == m ){
            return 0;
        }

        int w1 = findgrid(martix,x+1,y,n,m);
        int w2 = findgrid(martix,x,y+1,n,m);
        return w1+w2;
    }
    public static void main(String args[]){
        int n=20,m=25;
        int martix[][] = new int[n][m];

        int ans = findgrid(martix,0,0,n,m);
        System.out.print(ans);



    }
}