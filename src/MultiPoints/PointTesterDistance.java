package MultiPoints;
import java.util.Scanner;
public class PointTesterDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x and y for two points a and b");
//        // (1)
//        double x1 = input.nextDouble();
//        double y1 = input.nextDouble();
//
//        double x2 = input.nextDouble();
//        double y2 = input.nextDouble();
//
//
//        Point p1 = new Point(x1, y1);
//        Point p2 = new Point(x2, y2);
        // or (2)
        Point p3 = new Point(input.nextDouble(), input.nextDouble());
        Point p4 = new Point(input.nextDouble(), input.nextDouble());

            double distanceFinal = Point.distance(p3, p4);
            System.out.printf("The distance between (%2f, %2f ) and (%2f,%2f ) is %2f", p3.getX(), p3.getY(), p4.getX(), p4.getY(), distanceFinal);

        }
    }

