public class dec {
public static void decOrder(int n){
    if(n==1){
        System.out.println(1);
        return;
    }
   
    System.out.println(n);
    decOrder(n-1);
}
    public static void main(String[] args) {
        int n=10;
 
        decOrder(n);
    }
}