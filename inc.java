public class inc {

    public static void incOrder(int n){

        if(n==1){
            System.out.println(1);
            return;
        }
        incOrder(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        incOrder(n);
    }
}
