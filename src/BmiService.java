public class BmiService {
    public int calculate(float height, int weight) {
        int imt = (int) (weight / (height * height));

        return imt;
    }
}
