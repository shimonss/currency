public class ILS extends coin {
    private final double value = 0.28;
    public double getValue() {
        return value;
    }
    public double calculate(double input){
        return input*getValue();
    }
}
