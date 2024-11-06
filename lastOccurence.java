public class lastOccurence {
    public static int lastoccur(int arr[], int key, int i) {
if(i ==arr.length){
    return -1;

}
int isfound= lastoccur(arr, key, i+1);
if(isfound==-1 && arr[i]==key){
    return i;
}
return isfound;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,4,5,6,6};
        // int key=6;
        int key=5;
        int i=0;
        System.out.println(lastoccur(arr, key, i));


    }
}
