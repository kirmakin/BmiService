class BmiService {
    public int calculate(int Weight, float Growth) {

        int index = (int) (Weight / (Growth * Growth));
        return index;
    }
}