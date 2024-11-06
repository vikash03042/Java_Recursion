public class sum {
    public static int sumofN(int n){
if(n==1)
{
    return 1;
}
int snm1=sumofN(n-1);
int sn=n+snm1;

        return sn;
    }
    public static void main(String[] args) {
        int n=5;
       System.out.println(sumofN(n)); 
    }
    
}
