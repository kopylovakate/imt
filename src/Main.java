public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        float rost = 1.87F;
        int ves = 98;
        int imt = service.calculate(rost, ves);


        System.out.println(imt);


    }
}
