import java.util.Scanner;
class AreaCalculator{
   public static void findArea(double radius){
        double area =  (3.14)* radius*radius;
        System.out.println("Area of circle is "+area);
    }
   public static void findArea(int l,int b){
        int area = l*b;
        System.out.println("Area of rectangle is "+area);
    }
    public static void findArea(float side){
        double area = side*side;
        System.out.println("Area of square is "+area);
    }
}
public class FindArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of circel :");
        double radius = s.nextDouble();
        System.out.print("Enter length of rectangle : ");
        int l = s.nextInt();
        System.out.print("Enter breadth of rectangle : ");
        int b = s.nextInt();
        System.out.print("Enter the side of square : ");
        float side = s.nextFloat();
        
        AreaCalculator.findArea(radius);
        AreaCalculator.findArea(l,b);
        AreaCalculator.findArea(side);
        s.close();
    }    
}
