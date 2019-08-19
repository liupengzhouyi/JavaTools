package RandomNumberII.factory;

import RandomNumberII.model.Coordinate;

/**
 * function: get random number
 */
public interface GetRandomNumber {

    /**
     * @param kind 表示要获取的数据数类型 ：
     * @param number 表示要生成
     * @return
     */
    String getRandomNumber(int kind, int number);

    /**
     * 生成一组随机坐标
     * 一组表示：数据行
     * 一组表示：数据列
     * @return
     */
    public Coordinate[] createRandomNumber();

}
