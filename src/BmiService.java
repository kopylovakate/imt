public class BmiService {
    public int calculate(float rost, int ves) {
        int imt = (int) (ves/(rost*rost));

        return imt;
    }
}
