package number.Conversion;

/**
 * conversion number
 * author :liupeng
 * date: 2019年8月11日16点10分
 */
public interface Conversion {

    /**
     * double type to capital number
     * @param number
     */
    public void conversionNumber(double number);

    /**
     * string type conversion to capital number
     * @param number
     */
    public void conversionString(String number);

    /**
     * chinese string type to capital number
     * @param number
     */
    public void conversionChineseString(String number);
}
