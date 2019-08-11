package number.Conversion;

public class ConversionImpl implements Conversion {

    public ConversionImpl() {
    }

    /**
     * capital number
     */
    String capitalNumber = "";

    /**
     * double type to capital number
     * @param number
     */
    @Override
    public void conversionNumber(double number) {
        int tempNumber = (int) number;
        switch (tempNumber) {
            case 0: {
                this.setCapitalNumber("零");
                break;
            }
            case 1 : {
                this.setCapitalNumber("壹");
                break;
            }
            case 2 : {
                this.setCapitalNumber("贰");
                break;
            }
            case 3 : {
                this.setCapitalNumber("叁");
                break;
            }
            case 4 : {
                this.setCapitalNumber("肆");
                break;
            }
            case 5 : {
                this.setCapitalNumber("伍");
                break;
            }
            case 6 : {
                this.setCapitalNumber("陆");
                break;
            }
            case 7 : {
                this.setCapitalNumber("柒");
                break;
            }
            case 8 : {
                this.setCapitalNumber("捌");
                break;
            }
            case 9 : {
                this.setCapitalNumber("玖");
                break;
            }
        }
    }

    /**
     * string type conversion to capital number
     * @param number
     */
    @Override
    public void conversionString(String number) {
        switch (number) {
            case "0" : {
                this.setCapitalNumber("零");
                break;
            }
            case "1" : {
                this.setCapitalNumber("壹");
                break;
            }
            case "2" : {
                this.setCapitalNumber("贰");
                break;
            }
            case "3" : {
                this.setCapitalNumber("叁");
                break;
            }
            case "4" : {
                this.setCapitalNumber("肆");
                break;
            }
            case "5" : {
                this.setCapitalNumber("伍");
                break;
            }
            case "6" : {
                this.setCapitalNumber("陆");
                break;
            }
            case "7" : {
                this.setCapitalNumber("柒");
                break;
            }
            case "8" : {
                this.setCapitalNumber("捌");
                break;
            }
            case "9" : {
                this.setCapitalNumber("玖");
                break;
            }
        }
    }

    /**
     * chinese string type to capital number
     * @param number
     */
    @Override
    public void conversionChineseString(String number) {
        switch (number) {
            case "零" : {
                this.setCapitalNumber("零");
                break;
            }
            case "一" : {
                this.setCapitalNumber("壹");
                break;
            }
            case "二" : {
                this.setCapitalNumber("贰");
                break;
            }
            case "三" : {
                this.setCapitalNumber("叁");
                break;
            }
            case "四" : {
                this.setCapitalNumber("肆");
                break;
            }
            case "五" : {
                this.setCapitalNumber("伍");
                break;
            }
            case "六" : {
                this.setCapitalNumber("陆");
                break;
            }
            case "七" : {
                this.setCapitalNumber("柒");
                break;
            }
            case "八" : {
                this.setCapitalNumber("捌");
                break;
            }
            case "九" : {
                this.setCapitalNumber("玖");
                break;
            }
        }
    }

    public String getCapitalNumber() {
        return capitalNumber;
    }

    public void setCapitalNumber(String capitalNumber) {
        this.capitalNumber = capitalNumber;
    }

    /*public static void main(String[] args) {
        String s = "零\t壹\t贰\t叁\t肆\t伍\t陆\t柒\t捌\t玖";
        String[] strings =  s.split("\t");
        String ss = "零、一、二、三、四、五、六、七、八、九";
        String[] stringss = ss.split("、");
        for (int i=0;i<10;i++) {
            System.out.println("" +
                    "case \""+  stringss[i] + "\" : {\n" +
                    "    this.setCapitalNumber(\""+ strings[i] +"\");\n" +
                    "    break;\n" +
                    "}");
        }

    }*/
}
