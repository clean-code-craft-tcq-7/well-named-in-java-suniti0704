package colorcoder;

public class ColorPairUtils {
    public final static String MajorColorNames[] = {
        "White", "Red", "Black", "Yellow", "Violet"
    };
    public final static String MinorColorNames[] = {
        "Blue", "Orange", "Green", "Brown", "Slate"
    };
    
    final static int numberOfMajorColors = MajorColorNames.length;
    final static int numberOfMinorColors = MinorColorNames.length;

    

    public static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            ColorResolver.fromIndex(MajorColor.values(), zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor =
        ColorResolver.fromIndex(MinorColor.values(), zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }
}