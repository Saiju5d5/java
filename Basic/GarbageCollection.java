public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection g = new GarbageCollection();
        g = null;
        System.out.println("Garbage collection called");
        System.gc();
    }
}
