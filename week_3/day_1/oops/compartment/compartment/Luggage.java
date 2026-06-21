package compartment;

public class Luggage extends Compartment {
    @Override
    public String notice() {
        return "[Luggage] This compartment is for luggage and cargo only. No passengers allowed.";
    }
}