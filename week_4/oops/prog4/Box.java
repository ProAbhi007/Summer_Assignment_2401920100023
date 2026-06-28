class Box {
    protected double length, breadth;

    public Box(double length, double breadth) {
        this.length  = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length  = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.printf("Area    = %.2f%n", area());
    }
}