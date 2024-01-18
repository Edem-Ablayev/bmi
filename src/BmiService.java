public class BmiService {
    public double calculate(int m, double h) {
        double result;
        double i = Math.pow(h, 2);
        result = m / i;
        return result;
    }
}
