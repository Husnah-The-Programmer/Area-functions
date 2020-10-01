import java.util.Scanner;
public class AreaFunctions{
     static double areaCalculator(float radius){
         double area = 3.14 * radius * radius;

         return area;
     }
    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       float r;

        System.out.println("Enter Radius of circle:\n");
        r=input.nextFloat();
        System.out.println("Area of circle:"+areaCalculator(r));
    }
}   