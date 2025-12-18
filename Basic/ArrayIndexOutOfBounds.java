public class ArrayIndexOutOfBounds {
    public static void main(String args[]){
        int arr[]={1,4,3,5,6};
        float num[]=new float[4];
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ArrayIndexOutOfBounds exception is handled.");
        }
        try {
            System.out.println(num[4]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
