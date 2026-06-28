class Box3D extends Box {
    private double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Height  = " + height);
        System.out.printf("Volume  = %.2f%n", volume());
    }

    public static void main(String[] args) {
        System.out.println("=== Box (2D) ===");
        Box b = new Box(5.0, 3.0);
        b.display();

        System.out.println("\n=== Box3D (3D) ===");
        Box3D b3 = new Box3D(5.0, 3.0, 4.0);
        b3.display();
    }
}