import java.awt.*;

public class Task16Point {
    public double distance(int xA,int xB,int yA, int yB){

        return Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        double distance=first.distance(first.getX(),first.getY(),second.getX(),second.getY());
        System.out.println(distance);
       // System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
      //  System.out.println("distance()= " + point.distance());
    }
}