package compartment;

public class Ladies extends Compartment {
    @Override
    public String notice() {
        return "[Ladies] This compartment is reserved exclusively for women passengers.";
    }
}