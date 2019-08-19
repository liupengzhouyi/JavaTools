package RandomNumberII.factory;

import RandomNumberII.model.Coordinate;

public class RandomFourNumber implements GetRandomNumber {

    /**
     * @param kind 表示要获取的数据数类型 ：
     * @param number 表示要生成
     * @return
     */
    @Override
    public String getRandomNumber(int kind, int number) {

        return null;
    }

    @Override
    public Coordinate[] createRandomNumber() {
        return new Coordinate[0];
    }
}
