class Point {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x)         { this.x = x; }
    public void setY(int y)         { this.y = y; }
    public void setXY(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return x; }
    public int getY() { return y; }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.print("Default constructor  -> ");
        p1.display();

        Point p2 = new Point(4, 7);
        System.out.print("Parameterized        -> ");
        p2.display();

        p1.setX(10);
        System.out.print("After setX(10)       -> ");
        p1.display();

        p1.setY(20);
        System.out.print("After setY(20)       -> ");
        p1.display();

        p1.setXY(99, 88);
        System.out.print("After setXY(99, 88)  -> ");
        p1.display();
    }
}