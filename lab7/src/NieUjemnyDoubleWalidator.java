public class NieUjemnyDoubleWalidator {
    private static final NieUjemnyDoubleWalidator INSTANCE = new NieUjemnyDoubleWalidator();

    public static NieUjemnyDoubleWalidator getInstance() {
        return INSTANCE;
    }

    public void isValid(double doub)
    {
        if(doub < 0)
        {
            throw new LessThanZero(doub);
        }


    }

    private NieUjemnyDoubleWalidator() {}
}
