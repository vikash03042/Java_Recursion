public class Firstoccurrence {
    public static int firstoccur(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstoccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,65,5};
        int key=5;
        int i=0;
        System.out.println(firstoccur(arr, key, i));
        
    }
    
}
