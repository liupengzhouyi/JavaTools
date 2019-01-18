package invitationCode.lpEffectiveness;


/**
 * ---------------------------------------------------
 * |功能 (function) | 提供有效的表示
 * |               |
 * |               |
 * |---------------------------------------------------
 * | 参数()         | 无
 * ---------------------------------------------------
 * | 返回值类型（return value type）| int / boolean
 * ---------------------------------------------------
 * |  版 本（version) |    时 间      |  作者    | 外文名
 * ---------------------------------------------------
 * |   V 1.0.0       |  2019-01-16   |  刘鹏    |  no
 * ---------------------------------------------------
 * |                 |               |         |
 * ---------------------------------------------------
 */
public class Effective implements InvitationEffectiveness {
    @Override
    public boolean getBooleanEffective() {
        return true;
    }

    @Override
    public int getIntEffeective() {
        return 1;
    }

    public static void main(String[] args) {
        Effective effective = new Effective();

        System.out.println(effective.getBooleanEffective());
        System.out.println(effective.getIntEffeective());
    }
}
