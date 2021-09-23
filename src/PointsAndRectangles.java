import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x coordinate:");
        int xCoord = scan.nextInt();
        System.out.print("Enter the y coordinate:");
        int yCoord = scan.nextInt();
        System.out.print("Enter the length:");
        int length = scan.nextInt();
        System.out.print("Enter the width:");
        int height = scan.nextInt();
        Dimension d = new Dimension(length, height);
        Point p = new Point(xCoord, yCoord);
        Rectangle r = new Rectangle(p, d);
        System.out.println(p);
        System.out.println(d);
        System.out.print(r);




        

        //Instantiate a Point object p. Hint: you will need the keyword "new"


        // create print statements and get input for the length and width

        //Instantiate a Dimension object d.

        //Instantiate a Rectangle object r.

        // Print each object p, d, and r on a separate line.
    }
}