public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 40;
        double height = 1.40;
        double bmi = service.calculate(mass, height);
        System.out.println((int)bmi);
    }
}
