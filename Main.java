public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int Weight = 60;
        double Growth = 1.74;
        int index = service.calculate(Weight, (float) Growth);
        System.out.println(index);
    }
}