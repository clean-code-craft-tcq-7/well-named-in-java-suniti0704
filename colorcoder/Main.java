package colorcoder;

public class Main {
    static void testNumberToPair(int pairNumber,
        MajorColor expectedMajor,
        MinorColor expectedMinor)
    {
        ColorPair colorPair = ColorPairUtils.GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    static void testPairToNumber(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber)
    {
        int pairNumber = ColorPairUtils.GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }

    public static void main(String[] args) {
        testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
