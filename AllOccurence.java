public class AllOccurence {
    // fora given array of size N. You have to find all the occurrences (indices) of a given element (key) and print them. Use recursive function to solve this problem.
    public static int allOccur(int arr[],int key,int i){
if(i==arr.length){

    return i;
}

if(arr[i]==key){
    System.out.print(i+" ");
}

        return allOccur(arr, key, i+1); 
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        // sample output-1 5 7 8
allOccur(arr, key, 0);
    }
}