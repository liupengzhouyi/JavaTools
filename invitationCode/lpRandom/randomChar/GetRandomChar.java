package invitationCode.lpRandom.randomChar;

/**
 * ---------------------------------------------------
 * |功能 (function) | 获取三个随机字母
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
public class GetRandomChar {

    private String RandomString = null;

    private RandomOneChar randomOneChar = null;

    public String getRandomString() {
        return RandomString;
    }

    public void setRandomString(String RandomString) {
        this.RandomString = this.RandomString + RandomString;
    }

    public void init() {
        this.RandomString = new String();
        this.RandomString = "";
    }

    public GetRandomChar() {
        this.init();
        String tempString = "";
        for (int i=0; i<3; i++) {
            randomOneChar = new RandomOneChar();
            tempString = randomOneChar.getAChar();
            this.setRandomString(tempString);
        }
    }

    public static void main(String[] args) {
        GetRandomChar getRandomChar = new GetRandomChar();
        System.out.println(getRandomChar.getRandomString());
    }
}
