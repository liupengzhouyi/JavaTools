package Password;

import java.util.ArrayList;

public class getCharNumber {

    private String string1 = null;
    private String string2 = null;
    private String string3 = null;
    private String string4 = null;

    private ArrayList arrayList1 = new ArrayList();
    private ArrayList arrayList2 = new ArrayList();
    private ArrayList arrayList3 = new ArrayList();
    private ArrayList arrayList4 = new ArrayList();

    public void init() {
        this.string1 = new String();
        this.string2 = new String();
        this.string3 = new String();
        this.string4 = new String();
        this.setString1("1234567890");
        this.setString2("qwerthnmjuygbzxcvasdfioplk");
        this.setString3("ASDEWXZQCRGBYTFVNHJIKMULOP");
        this.setString4("!@#$%^&*()<>,.-=`~/");
        this.setArrayList1();
        this.setArrayList2();
        this.setArrayList3();
        this.setArrayList4();
    }


    public String CharToString(char c) {
        return c + "";
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString3() {
        return string3;
    }

    public void setString3(String string3) {
        this.string3 = string3;
    }

    public String getString4() {
        return string4;
    }

    public void setString4(String string4) {
        this.string4 = string4;
    }

    public void setArrayList1() {
        String tempString;
        int tempNumber = 0;
        char[] chars = this.getString1().toCharArray();
        for (char c : chars
             ) {

            tempString = this.CharToString(c);

            this.getArrayList1().add(tempNumber, tempString);

            tempNumber = tempNumber + 1;
        }
    }

    public void setArrayList2() {
        String tempString;
        int tempNumber = 0;
        char[] chars = this.getString2().toCharArray();
        for (char c : chars
        ) {

            tempString = this.CharToString(c);

            this.getArrayList2().add(tempNumber, tempString);

            tempNumber = tempNumber + 1;
        }
    }

    public void setArrayList3() {
        String tempString;
        int tempNumber = 0;
        char[] chars = this.getString3().toCharArray();
        for (char c : chars
        ) {

            tempString = this.CharToString(c);

            this.getArrayList3().add(tempNumber, tempString);

            tempNumber = tempNumber + 1;
        }
    }

    public void setArrayList4() {
        String tempString;
        int tempNumber = 0;
        char[] chars = this.getString4().toCharArray();
        for (char c : chars
        ) {

            tempString = this.CharToString(c);

            this.getArrayList4().add(tempNumber, tempString);

            tempNumber = tempNumber + 1;
        }
    }

    public ArrayList getArrayList1() {
        return arrayList1;
    }

    public ArrayList getArrayList2() {
        return arrayList2;
    }

    public ArrayList getArrayList3() {
        return arrayList3;
    }

    public ArrayList getArrayList4() {
        return arrayList4;
    }
}
