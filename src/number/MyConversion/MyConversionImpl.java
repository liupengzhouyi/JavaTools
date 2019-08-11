package number.MyConversion;

import number.Conversion.ConversionImpl;

public class MyConversionImpl implements MyConversion {

    public MyConversionImpl() {
        this.setMoney("");
    }

    /**
     * 初始化
     */


    ConversionImpl conversion = new ConversionImpl();

    String money = "";

    /**
     * IntegerToCapitalNumber
     * @param number
     * @return
     */
    @Override
    public String IntegerToCapitalNumber(double number) {
        String string = (int) number + "";
        String newString = "";
        char[] chars = string.toCharArray();
        int k = 0;
        for (int i=chars.length-1;i>=0;i--) {
            k++;
            newString = chars[i] + newString;
            if (k%4==0) {
                newString = "." + newString;
                k = 0;
            }
        }
        // 圆万	亿
        // 壹佰贰拾叁亿 肆仟伍佰陆拾柒万 捌仟玖佰壹拾贰圆

        return null;
    }

    /**
     * DecimalToCapitalNumber
     * @param number
     * @return
     */
    @Override
    public String DecimalToCapitalNumber(double number) {
        return null;
    }

    /**
     * IntegerToCapitalNumber
     * @param number
     * @return
     */
    @Override
    public String IntegerToCapitalNumber(String number) {
        return null;
    }

    /**
     * DecimalToCapitalNumber
     * @param number
     * @return
     */
    @Override
    public String DecimalToCapitalNumber(String number) {
        return null;
    }

    /**
     * ChineseCharactersToCapitalNumber
     * @param maney
     * @return
     */
    @Override
    public String ChineseCharactersToCapitalNumber(String maney) {
        return null;
    }

    public ConversionImpl getConversion() {
        return conversion;
    }

    public void setConversion(ConversionImpl conversion) {
        this.conversion = conversion;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
