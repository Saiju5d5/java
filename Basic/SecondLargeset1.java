public class SecondLargeset1 {
    public static int getSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] arr ={90,49,68,23,56,892,67};
        System.out.println(getSecondLargest(arr));
    }
}
