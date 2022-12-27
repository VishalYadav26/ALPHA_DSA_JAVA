public class Recrsion_1stOccurance {
    public static int FirstOccurance(int arr[],int key,int i){
        if (i==arr.length){
            return -1;
         }
        if (arr[i]==key){
           return i;
        }
        
        return FirstOccurance(arr,key ,i+1);
    }
    public static void main(String args[]){
        int arr[]= {1,2,6,3,4,7,2,4};
        System.out.println(FirstOccurance(arr, 4, 0));
    }
    
}
