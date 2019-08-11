package number.MyConversion.OnlyForFourNumberToCapital;

import number.Conversion.Conversion;
import number.Conversion.ConversionImpl;

public class CapitalForFourNumber {

    private String number = null;

    private ConversionImpl conversion = null;

    public CapitalForFourNumber(String number) {
        this.number = number;
        this.conversion = new ConversionImpl();
        this.mainFunction();
    }

    public void mainFunction() {
        String string = "仟\t佰\t拾\t";
        String[] strings = string.split("\t");
        boolean key = false;

        String a0000 = "";
        this.getConversion().conversionString(this.getNumber().charAt(0) + "");
        String temp0000 = this.getConversion().getCapitalNumber();
        if (temp0000.equals("零")) {
            a0000 =  "零";
        } else{
            a0000 = temp0000 + "仟";
        }
        //System.out.println(a0000);
        String a000 = "";
        this.getConversion().conversionString(this.getNumber().charAt(1) + "");
        String temp000 = this.getConversion().getCapitalNumber();
        if (temp000.equals("零")) {
            a000 =  "零";
        } else{
            a000 = temp000 + "佰";
        }
        //System.out.println(a0000 + " " + a000);
        String a00 = "";
        this.getConversion().conversionString(this.getNumber().charAt(2) + "");
        String temp00 = this.getConversion().getCapitalNumber();
        if (temp00.equals("零")) {
            a00 =  "零";
        } else{
            a00 = temp00 + "拾";
        }
        //System.out.println(a0000 + " " + a000 + " " + a00);
        String a0 = "";
        this.getConversion().conversionString(this.getNumber().charAt(3) + "");
        String temp0 = this.getConversion().getCapitalNumber();
        if (temp0.equals("零")) {
            a0 =  "零";
        } else{
            a0 = temp0 ;
        }
        //System.out.println(a0000 + " " + a000 + " " + a00 + " " + a0);
        if (a0000.equals("零")) {
            if(a000.equals("零")) {
                if (a00.equals("零")) {
                    if (a0.equals("零")) {
                        this.setNumber("");
                    } else {
                        this.setNumber(a0);
                    }
                } else {
                    if (a0.equals("零")) {
                        this.setNumber(a00);
                    } else {
                        this.setNumber(a00 + a0);
                    }
                }
            } else {
                if (a00.equals("零")) {
                    if (a0.equals("零")) {
                        this.setNumber(a000);
                    } else {
                        this.setNumber(a000 + a00 + a0);
                    }
                } else {
                    if (a0.equals("零")) {
                        this.setNumber(a000 + a00);
                    } else {
                        this.setNumber(a000 + a00 + a0);
                    }
                }
            }
        } else {
            if(a000.equals("零")) {
                if (a00.equals("零")) {
                    if (a0.equals("零")) {
                        this.setNumber(a0000);
                    } else {
                        this.setNumber(a0000 + a00 + a0);
                    }
                } else {
                    if (a0.equals("零")) {
                        this.setNumber(a0000 + a000 + a00);
                    } else {
                        this.setNumber(a0000 + a000 + a00 + a0);
                    }
                }
            } else {
                if (a00.equals("零")) {
                    if (a0.equals("零")) {
                        this.setNumber(a0000 + a000);
                    } else {
                        this.setNumber(a0000 + a000 + a00 + a0);
                    }
                } else {
                    if (a0.equals("零")) {
                        this.setNumber(a0000 + a000 + a00);
                    } else {
                        this.setNumber(a0000 + a000 + a00 + a0);
                    }
                }
            }
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ConversionImpl getConversion() {
        return conversion;
    }

    public void setConversion(ConversionImpl conversion) {
        this.conversion = conversion;
    }
}
