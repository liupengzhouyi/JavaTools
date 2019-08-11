package number.InputDecomposition;

/**
 * implements numbers decomposition numbers
 * author:liupeng
 * date: 2019年8月11日 15点03分
 */
public class DecomnpositionImpl implements Decomposition {

    /**
     * integer which type is string.
     */
    String stringInteger = null;

    /**
     * decimal which type is string.
     */
    String stringDecimal = null;

    /**
     * integer which type is double.
     */
    double doubleInteger = 0;

    /**
     * decimal which type is double.
     */
    double doubleDecimal = 0;

    /**
     * decomposition number which type is double.
     * @param number
     */
    @Override
    public void decompositionNumber(double number) {
        double numberI = (int) (number / 1);
        double numberII = numberI % 1;
        this.setDoubleInteger(numberI);
        this.setDoubleDecimal(numberII);
    }

    /**
     * decomposition number which type is string.
     * @param number
     */
    @Override
    public void decompositionString(String number) {
        //System.out.println(number);
        String[] strings = number.split("\\.");
        try {
            this.setStringInteger(strings[0]);
            this.setStringDecimal(strings[1]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * decomposition number which type is chinese characters.
     * @param number
     */
    @Override
    public void decompositionChineseString(String number) {
        String[] strings = number.split("零");
        String numberI = "";
        String numberII = "";
        for (int i=0;i<strings.length - 1;i++) {
            numberI = numberI + "零" + strings[i];
        }
        numberII = strings[strings.length-1];
        this.setStringInteger(numberI);
        this.setStringDecimal(numberII);
    }

    public String getStringInteger() {
        return stringInteger;
    }

    public void setStringInteger(String stringInteger) {
        this.stringInteger = stringInteger;
    }

    public String getStringDecimal() {
        return stringDecimal;
    }

    public void setStringDecimal(String stringDecimal) {
        this.stringDecimal = stringDecimal;
    }

    public double getDoubleInteger() {
        return doubleInteger;
    }

    public void setDoubleInteger(double doubleInteger) {
        this.doubleInteger = doubleInteger;
    }

    public double getDoubleDecimal() {
        return doubleDecimal;
    }

    public void setDoubleDecimal(double doubleDecimal) {
        this.doubleDecimal = doubleDecimal;
    }
}
