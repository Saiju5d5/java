public class insertionSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        //insertion sort
        int[] arr={7,9,6,2,8,5,1};
        for(int i=1;i<arr.length;i++){
            int key = arr[i]; //first element of unsorted array
            int j=i-1; //index of last element of sorted array
            while (j>=0 && key < arr[j]){
                arr[j+1]=arr[j]; //shift the large element one position to the right
                j--;
            }
            arr[j+1]= key;
        }
        printArray(arr);
    }
}
