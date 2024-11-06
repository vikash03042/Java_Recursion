public class optmizepow {
    public static int optimizedpower(int a, int n)
{
if(n==0){
    return 1;
}
int half= optimizedpower(a,n/2);
int halfsq= half*half;
if(n%2 != 0){
    halfsq = a*halfsq;
}


    return halfsq;
}
    public static void main(String[] args) {
        int a=2;
        int n=3;
System.out.println(optimizedpower(a, n));
    }
}
