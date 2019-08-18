package RandomNumberII.factory;

/**
 * function: get random number
 */
public interface GetRandomNumber {

    /**
     * @param kind 表示要获取的数据数类型 ：
     * @param number biaoshi
     * @return
     */
    String getRandomNumber(int kind, int number);

}
