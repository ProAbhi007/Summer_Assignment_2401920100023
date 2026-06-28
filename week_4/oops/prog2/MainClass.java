class Outer {
    void display() {
        System.out.println("Outer class display() called.");
    }

    class Inner {
        void display() {
            System.out.println("Inner class display() called.");
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}