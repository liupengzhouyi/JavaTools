package number.MyConversion;

/**
 * all kinds of number type to capital numbers
 * author: liupeng
 * date: 2019年8月11日 16点53分
 */
public interface MyConversion {

    /**
     * IntegerToCapitalNumber
     * @param number
     * @return
     */
    public String IntegerToCapitalNumber(double number);

    /**
     * DecimalToCapitalNumber
     * @param number
     * @return
     */
    public String DecimalToCapitalNumber(double number);

    /**
     * IntegerToCapitalNumber
     * @param number
     * @return
     */
    public String IntegerToCapitalNumber(String number);

    /**
     * DecimalToCapitalNumber
     * @param number
     * @return
     */
    public String DecimalToCapitalNumber(String number);

    /**
     * ChineseCharactersToCapitalNumber
     * @param maney
     * @return
     */
    public String ChineseCharactersToCapitalNumber(String maney);
    
}
