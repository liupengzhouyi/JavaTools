package invitationCode.count;


/**
 * ---------------------------------------------------
 * |功能 (function) | 提供五位数的计数码
 * |               | 数据来源：数据库中
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

public class GetPrescriptionCount {
    private int count = -1;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void testSetCount() {
        this.count = 12345;
    }

    public GetPrescriptionCount() {
        this.testSetCount();
    }

    public static void main(String[] args) {
        GetPrescriptionCount getPrescriptionCount = new GetPrescriptionCount();
        System.out.println(getPrescriptionCount.getCount());
    }
}
