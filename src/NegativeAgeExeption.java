public class NegativeAgeExeption extends Exception{
    private int ageValue;

    public NegativeAgeExeption(int ageValue) {
        this.ageValue = ageValue;
    }

    public int getAgeValue() {
        return ageValue;
    }
}
