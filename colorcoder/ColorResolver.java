package colorcoder;

public class ColorResolver {
    public static <T extends Enum<T>> T fromIndex(T[] enums, int index) {
        for(T color: enums) {
            if(((IndexedColor)color).getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}