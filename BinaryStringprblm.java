public class BinaryStringprblm {
    // prnt all the binary sting of the size N without consecutive ones. 
    public static void binstr(int n,int lastplace,String str){
if(n==0){
    System.out.println(str);
    return;
}
    binstr(n-1, 0, str+"0");
    if(lastplace==0)
    {
        binstr(n-1, 1, str+"1");
    }
    }
    public static void main(String[] args) {
        int n=3;
        String str="";
         binstr(n, 0, str+"");
    }
}
