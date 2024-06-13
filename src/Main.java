public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int weight = 98; // вес в кг
        double height = 1.87; // рост в метрах
        int bmi = bmiService.calculate(weight, height);
        System.out.println("BMI: " + bmi);
    }
}