public class subset{
    public static void findSubset(String str, String ans, int i){
        // basecase
            if(i==str.length()){
                if(ans.length()==0){
                    System.out.println("null");
                    return;
                }else{

                System.out.println(ans);
                return;
                }
            }
        // recursion
        // yes
        findSubset(str,ans+str.charAt(i),i+1);
        // no
        findSubset(str,ans,i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        String ans = "";
        findSubset(str,ans,0);
    }
}