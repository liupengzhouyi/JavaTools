package number.InputDecomposition;

/**
 * decomposition Interface
 * author: liupeng
 * date: 2019年8月11日 14点58分
 */
public interface Decomposition {

    /**
     * decomposition number which type is double.
     * @param number
     */
    public void decompositionNumber(double number);

    /**
     * decomposition number which type is string.
     * @param number
     */
    public void decompositionString(String number);


    /**
     * decomposition number which type is chinese characters.
     * @param number
     */
    public void decompositionChineseString(String number);
}
