public class Recursion{
    public static void PrintDesc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        PrintDesc(n-1);


    }
    public static void PrintInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n -1);
        int fn = n * fnm1;
        return fn;
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }

        int son = sum(n-1);
        int mysum = n+son;
        return mysum;
    }

    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
       int  fonm1 = fibo(n-1);
       int  fonm2 = fibo(n-2);
       int fn = fonm1 + fonm2;
       return fn;
    }

    public static boolean isSorted(int myarr[], int i){
        if(i == myarr.length-1){
            return true;
        }
        if(myarr[i] > myarr[i+1]){
            return false;
        }

        return isSorted(myarr, i+1);
    }

    public static int findKey(int arr[], int i,int key){
        if(i== arr.length){
            return -1;
        }
            if(key == arr[i]){
                return i;
            }

           return findKey(arr, i+1,key);
    }

    public static int lastOcc(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
    int isFound = lastOcc(arr, i+1, key);
    if(isFound == -1 && arr[i] == key){
        return i;
    }
        return isFound;
    }

    public static int findPow(int num,int pow){
        if(pow == 1){
            return num;
        }
        int xnm1 = findPow(num,pow-1);
        int xn = num * xnm1;
        return xn;

        // or we can write
       // return x * findPow(num,pow-1); ->  It's also write

    }

    public static int findPowOp(int num , int pow ){
        if( pow == 1){
            return num;
        }
        int sq = findPowOp(num,pow/2);
        int sqsum = sq*sq;
        if(num % 2 !=0){
            sqsum = num*sqsum;
        }

        return sqsum;
    }
    public static int tilling(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int tnm1 = tilling(n-1);
        int tnm2 = tilling(n-2);
        int sum = tnm1+ tnm2;
        return sum;
    }

    // public static void removedup(String mystr, int ind, StringBuilder newstr, boolean[] map){
    //     if(ind == mystr.length()){
    //         System.out.print(newstr);
    //         return;
    //     }
    //     // kaam

    //     char currChar = mystr.CharAt(ind);
    //     if(map[currChar-'a'] == true){
    //         removedup(mystr,ind+1, newstr, map);
    //     }else{
    //         map[currChar-'a'] = true;
    //         removedup(mystr,ind+1,newstr.append(currChar),map);
    //     }
    // }
    public static void main(String args[]){
        // PrintInc(10);
        int myarr[] = {1,2,63,5,5,3,2,4,555,333,333,44,56};
        int myarr2[] = {1,2,3,4,5,6,6,6};
        // System.out.print(isSorted(myarr,0));
        // System.out.print(findKey(myarr,0,5600));
        // System.out.print(lastOcc(myarr2, 0, 6));
        // System.out.print(findPow(2,10));
        // System.out.print(tilling(4));
        String mysrt = "appnaacoollage";
       // int myarr = new int[26];
        // removedup(mystr, 0, new StringBuilder(""), new boolean[26]= map);
        
    }
}