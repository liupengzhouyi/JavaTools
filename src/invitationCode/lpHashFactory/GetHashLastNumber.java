package invitationCode.lpHashFactory;


import invitationCode.count.GetPrescriptionCount;

/**
 * ---------------------------------------------------
 * |功能 (function) | 获取哈希的最后一位
 * |               |
 * |               |
 * |---------------------------------------------------
 * | 参数()         | 无
 * ---------------------------------------------------
 * | 返回值类型（return value type）| int
 * ---------------------------------------------------
 * |  版 本（version) |    时 间      |  作者    | 外文名
 * ---------------------------------------------------
 * |   V 1.0.0       |  2019-01-16   |  刘鹏    |  no
 * ---------------------------------------------------
 * |                 |               |         |
 * ---------------------------------------------------
 */
public class GetHashLastNumber {

    private String string = null;

    private int lastNumbeer;

    public void init() {
        this.string = new String();
    }

    public String getString() {
        return string;
    }

    public int getLastNumbeer() {
        return lastNumbeer;
    }

    public void setLastNumbeer(int lastNumbeer) {
        this.lastNumbeer = lastNumbeer;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void hash() {
        //获取参数
        String tempString = this.getString();
        //对参数哈希
        int number = tempString.hashCode();
        //取哈希的最后一位
        int tempLast = number % 10;
        if (tempLast < 0) {
            tempLast = 0 - tempLast;
        }
        //赋值
        this.setLastNumbeer(tempLast);
    }

    public GetHashLastNumber(String string) {
        this.init();
        this.setString(string);
        this.hash();
    }

    public static void main(String[] args) {
        GetHashLastNumber getHashLastNumber = new GetHashLastNumber("X5I9B2");
        System.out.println(getHashLastNumber.getLastNumbeer());
    }
}
