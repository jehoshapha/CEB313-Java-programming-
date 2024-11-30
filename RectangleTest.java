import java.util.Scanner;
public class RectangleTest {

    //Rectangle Test class 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the length of the rectangle ");
        //prompting the user to input the length of the object
        double len = input.nextDouble();
        System.out.println("input the width of the rectangle ");
        //prompting the user to input the width of the object (rectangle)
        double wid = input.nextDouble();

        Rectangle rectangle = new Rectangle();

        rectangle.setLength(len);
        rectangle.setWidth(wid);

        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
    
}
