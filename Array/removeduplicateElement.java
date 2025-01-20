public class removeduplicateElement{
    public static int sizeofarray(int arr [],int n){
        if(n == 0){
            return 0;
        }
        int i =0;
        for(int j =1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[]args){
int arr[] = {1, 2, 3, 4, 4, 4, 4};
int n = 7;
System.out.println("Size of array is "+sizeofarray(arr,n));
    }
}