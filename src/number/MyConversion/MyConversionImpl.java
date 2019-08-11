package number.MyConversion;

import number.Conversion.ConversionImpl;
import number.MyConversion.OnlyForFourNumberToCapital.CapitalForFourNumber;

public class MyConversionImpl implements MyConversion {

    public MyConversionImpl() {
        this.setMoney("");
    }

    /**
     * 初始化
     */


    ConversionImpl conversion = new ConversionImpl();

    String money = null;

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
        String[] strings = newString.split("\\.");
        String string1 = "圆\t万\t亿\t万亿";
        String[] strings1 = string1.split("\t");
        // System.out.println(string.length());
        int no = string.length() / 4;
        // System.out.println(no);
        for (int i=0;i<strings.length;i++) {
            if (strings[i].length() != 4) {
                for (int j=0;j<(4-strings[i].length()+1);j++) {
                    strings[i] = "0" + strings[i];
                }
            }
            // System.out.println(strings[i]);
            CapitalForFourNumber capitalForFourNumber = new CapitalForFourNumber(strings[i]);
            String tempNumber = capitalForFourNumber.getNumber();
            // System.out.println(tempNumber);
            if (no > 3) {
                this.setMoney("无法计算");
            } else {
                if ("".equals(tempNumber)) {
                    this.setMoney(this.getMoney());
                } else {
                    this.setMoney(this.getMoney() + tempNumber + strings1[no]);
                }
            }
            no--;
        }
        return this.getMoney();
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
