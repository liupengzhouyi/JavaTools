package invitationCode.lpEffectiveness;


/**
 * ---------------------------------------------------
 * |功能 (function) | 一个接口 提供有效性的表示
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
public interface InvitationEffectiveness {

    /**
     * 获取有效性表示
     * @return
     */
    public boolean getBooleanEffective();

    public int getIntEffeective();

}
