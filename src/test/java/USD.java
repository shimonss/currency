public class USD extends coin{
    private final double value = 3.52;

    public double getValue() {
        return value;
    }

    public double calculate(double input){
        return input*getValue();
    }
}
