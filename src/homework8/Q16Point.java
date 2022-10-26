package homework8;

public class Q16Point {
    private int x;
    private int y;

    public Q16Point() {
    }

    public Q16Point(int x, int y) {
    }

    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Q16Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public static void main(String[] args) {

        Q16Point first = new Q16Point(6,5);

        Q16Point second = new Q16Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Q16Point point = new Q16Point();

        System.out.println("distance()= " + point.distance());


    }
}



