public class LessThanZero extends IllegalArgumentException {
    public LessThanZero(double doub) {
        super("Współrzędne nie mogą być ujemne, podano: " + doub);
    }
}
