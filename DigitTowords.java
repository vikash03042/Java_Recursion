public class DigitTowords {
public static int DigToWord(int n){
if(n==1||n==2){
    return n;
}
for(int i=2;i<=n;i++)
{
    if(n%i!=0)
    {
return n ;

    }
   

}

    
    return DigToWord(n-1);
}

public static void main(String[] args) {
int n=5;
DigToWord(n);

    

}
    

}


