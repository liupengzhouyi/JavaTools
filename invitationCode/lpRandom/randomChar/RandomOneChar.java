package invitationCode.lpRandom.randomChar;

import java.util.HashMap;
import java.util.Random;

/**
 * ---------------------------------------------------
 * |功能 (function) | 获取一个随机字母
 * |               |
 * |               |
 * |---------------------------------------------------
 * | 参数()         | 无
 * ---------------------------------------------------
 * | 返回值类型（return value type）| String
 * ---------------------------------------------------
 * |  版 本（version) |    时 间      |  作者    | 外文名
 * ---------------------------------------------------
 * |   V 1.0.0       |  2019-01-16   |  刘鹏    |  no
 * ---------------------------------------------------
 * |                 |               |         |
 * ---------------------------------------------------
 */
public class RandomOneChar {
    private String AChar = null;

    public String getAChar() {
        return AChar;
    }

    public void setAChar(String AChar) {
        this.AChar = AChar;
    }

    private static HashMap<String, String> map = new HashMap<String, String>();

    public void initMap() {
        int intNumber = 1;
        String stringNumber = "";
        char charChar = 'A';
        String stringChar = "";
        for (int i=0; i<26; i++) {
            stringNumber = "" + intNumber;
            stringChar = "" + charChar;
            map.put(stringNumber, stringChar);
            //System.out.println(stringNumber + ":" + stringChar);
            intNumber = 1 + intNumber;
            charChar = (char) (1 + charChar);
        }
    }

    public void init() {
        this.AChar = new String();
        this.initMap();
    }

    public RandomOneChar() {
        this.init();
        Random random = new Random();
        int number = random.nextInt(26);
        int numI = random.nextInt(9);
        int numII = random.nextInt(9);
        number = number + numI + numII;
        number = number % 25 + 1;
        String stringNumber = "" + number;
        String randomChar = map.get(stringNumber);
        this.setAChar(randomChar);
        //System.out.println(number + " " + randomChar);
    }

    public static void main(String[] args) {
        RandomOneChar randomOneChar = new RandomOneChar();
        System.out.println(randomOneChar.getAChar());
    }

}
