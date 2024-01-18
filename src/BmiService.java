public class BmiService {
    public double calculate(int mass, double height) {
        double result;
        double squaring = Math.pow(height, 2);
        result = mass / squaring;
        return result;
    }
}
