public class frndpairing {
    public static int  frndpairprblm(int n){
if(n==1 ||n==2){
    return n;
}
int fnm1=frndpairprblm(n-1);
int fnm2=frndpairprblm(n-2);
int totways=fnm1+(n-1)*fnm2;
return totways;
    }
    public static void main(String[] args) {
        int n=3;
      System.out.println( frndpairprblm(n)); 
    }
}
