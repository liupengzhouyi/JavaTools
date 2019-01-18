package invitationCode.lpRandom.randomNumber;

import java.util.HashMap;
import java.util.Random;

/**
 * ---------------------------------------------------
 * |功能 (function) | 获取一个随机数字
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
public class RandomOneNumber {

    private String number = null;

    private HashMap<String, String> hashMap = new HashMap<String, String>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void hashMapInit() {
        int[] arrays = {-1, 9, 2, 3, 1, 6, 8, 4, 5, 9, 0};
        int IntNumber = -1;
        String StringNumber = "";
        String StringCount = "";
        for (int i=1; i<=10; i++) {
            IntNumber = arrays[i];
            StringNumber = IntNumber + "";
            StringCount = i + "";
            this.hashMap.put(StringCount, StringNumber);
        }
    }

    public void init() {
        this.number = new String();
        this.hashMapInit();
    }

    public RandomOneNumber() {
        this.init();
        Random random = new Random();
        int number = random.nextInt(10 + 1);
        int numI = random.nextInt(9);
        int numII = random.nextInt(5);
        number = number + numI + numII;
        number = number % 10 + 1;
        String stringNumber = number + "";
        String string = hashMap.get(stringNumber);
        this.setNumber(string);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            RandomOneNumber randomOneNumber = new RandomOneNumber();
            System.out.println(randomOneNumber.getNumber());
        }
    }
}
